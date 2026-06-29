@RestController
@RequestMapping("/api/material")
public class MaterialApplyController {

    @Autowired
    private MaterialApplyService materialApplyService;

    @PostMapping("/apply")
    public Result<Void> apply(@RequestBody @Valid ApplyDTO dto) {
        materialApplyService.applyMaterial(dto);
        return Result.success();
    }

    @GetMapping("/list")
    public Result<PageInfo<MaterialVO>> list(MaterialQueryDTO query) {
        PageHelper.startPage(query.getPageNum(), query.getPageSize());
        List<MaterialVO> list = materialApplyService.listMaterials(query);
        return Result.success(new PageInfo<>(list));
    }
}