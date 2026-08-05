@Service
public class OrderService {

    public void createOrder() {
        // 直接调用同类方法，事务不生效！
        this.doInsert();
    }

    @Transactional(rollbackFor = Exception.class)
    public void doInsert() {
        // 数据库操作
    }
}

@Transactional(rollbackFor = Exception.class)
private void doInsert() { // private 方法，事务不生效
    // ...
}

@Transactional(rollbackFor = Exception.class)
public void doInsert() {
    try {
        // 数据库操作抛异常了
    } catch (Exception e) {
        // 吞掉异常，事务不知道出错了，不会回滚
    }
}