// 你把领用耗材这个功能的 Service 完整写一下，包括参数校验、异常处理、事务控制。

@Service
public class MaterialApplyServiceImpl implements MaterialApplyService {

    @Autowired
    private MaterialMapper materialMapper;
    @Autowired
    private RecordMapper recordMapper;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private RiskControlService riskControlService;

    private static final String STOCK_PREFIX = "dcp:stock:";

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void applyMaterial(ApplyDTO dto) {
        // 1. 参数校验
        if (dto.getQuantity() <= 0) {
            throw new BusinessException("领用数量必须大于 0");
        }

        String redisKey = STOCK_PREFIX + dto.getMaterialId();

        // 2. Redis 预扣
        Long remain = redisTemplate.opsForValue().decrement(redisKey, dto.getQuantity());
        if (remain == null) {
            throw new BusinessException("缓存异常，请稍后重试");
        }
        if (remain < 0) {
            redisTemplate.opsForValue().increment(redisKey, dto.getQuantity());
            throw new BusinessException("库存不足");
        }

        try {
            // 3. MySQL 乐观锁落盘
            Material material = materialMapper.selectById(dto.getMaterialId());
            if (material == null) {
                redisTemplate.opsForValue().increment(redisKey, dto.getQuantity());
                throw new BusinessException("耗材不存在");
            }

            material.setStock(material.getStock() - dto.getQuantity());
            int rows = materialMapper.updateByIdWithVersion(material);
            if (rows == 0) {
                redisTemplate.opsForValue().increment(redisKey, dto.getQuantity());
                throw new BusinessException("并发冲突，请重试");
            }

            // 4. 插入领用记录
            Record record = new Record();
            record.setMaterialId(dto.getMaterialId());
            record.setApplicant(dto.getApplicant());
            record.setQuantity(dto.getQuantity());
            record.setStatus(0); // 待审批
            recordMapper.insert(record);

            // 5. 异步触发风控
            riskControlService.asyncCheck(record.getId());

        } catch (BusinessException e) {
            throw e;
        } catch (Exception e) {
            redisTemplate.opsForValue().increment(redisKey, dto.getQuantity());
            throw new BusinessException("系统异常，请稍后重试");
        }
    }
}