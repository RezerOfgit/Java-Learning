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