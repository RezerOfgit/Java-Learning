// 你的防超卖逻辑测过吗？怎么测的？

@SpringBootTest
class MaterialApplyServiceTest {

    @Autowired
    private MaterialApplyService materialApplyService;

    @Autowired
    private MaterialMapper materialMapper;

    @Test
    void testApplyMaterial_Success() {
        // given: 准备数据
        ApplyDTO dto = new ApplyDTO();
        dto.setMaterialId(1L);
        dto.setApplicant("test01");
        dto.setQuantity(2);
        
        // when: 执行
        materialApplyService.applyMaterial(dto);

        // then: 验证
        Material m = materialMapper.selectById(1L);
        // 验证库存减少了 2
        assertEquals(initialStock - 2, m.getStock());
    }

    @Test
    void testApplyMaterial_InsufficientStock() {
        // given: 库存只有 1，要领 10
        ApplyDTO dto = new ApplyDTO();
        dto.setMaterialId(1L);
        dto.setApplicant("test01");
        dto.setQuantity(10);

        // when & then: 应该抛异常
        assertThrows(BusinessException.class, () -> {
            materialApplyService.applyMaterial(dto);
        });
    }

    @Test
    void testConcurrentApply() throws InterruptedException {
		// 模拟 50 个线程同时领用
        int threadCount = 50;
        CountDownLatch latch = new CountDownLatch(threadCount);
        ExecutorService pool = Executors.newFixedThreadPool(threadCount);
        AtomicInteger successCount = new AtomicInteger(0);

        for (int i = 0; i < threadCount; i++) {
            pool.submit(() -> {
                try {
                    ApplyDTO dto = new ApplyDTO();
                    dto.setMaterialId(1L);
                    dto.setApplicant("user");
                    dto.setQuantity(1);
                    materialApplyService.applyMaterial(dto);
                    successCount.incrementAndGet();
                } catch (Exception ignored) {
                } finally {
                    latch.countDown();
                }
            });
        }

        latch.await();
        // 假设库存只有 10，成功数应该 <= 10，不会超卖
        Material m = materialMapper.selectById(1L);
        assertTrue(m.getStock() >= 0); // 不会超卖
        System.out.println("成功人数：" + successCount.get());
    }
}