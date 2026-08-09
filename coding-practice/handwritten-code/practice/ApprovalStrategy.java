// 1. 策略接口
public interface ApprovalStrategy {
    String getRole();           // 适用于哪个角色
    void approve(Record record); // 审批逻辑
}

// 2. 具体策略：普通员工审批
@Component
public class StaffApproval implements ApprovalStrategy {
    @Override
    public String getRole() { return "staff"; }

    @Override
    public void approve(Record record) {
        // 员工提交后直接进入待审批状态
        record.setStatus(0);
    }
}

// 3. 具体策略：主管审批
@Component
public class ManagerApproval implements ApprovalStrategy {
    @Override
    public String getRole() { return "manager"; }

    @Override
    public void approve(Record record) {
        // 主管可以直接审批通过
        record.setStatus(1);
    }
}

// 4. 策略工厂：Spring 启动时自动收集所有策略
@Component
public class ApprovalStrategyFactory {
    private final Map<String, ApprovalStrategy> strategyMap = new HashMap<>();

    @Autowired
    public ApprovalStrategyFactory(List<ApprovalStrategy> strategies) {
        for (ApprovalStrategy s : strategies) {
            strategyMap.put(s.getRole(), s);
        }
    }

    public ApprovalStrategy getStrategy(String role) {
        ApprovalStrategy strategy = strategyMap.get(role);
        if (strategy == null) {
            throw new BusinessException("不支持的角色：" + role);
        }
        return strategy;
    }
}

// 5. 使用：Service 里一行搞定，没有 if-else
public void approve(Record record, String role) {
    ApprovalStrategy strategy = strategyFactory.getStrategy(role);
    strategy.approve(record);
}