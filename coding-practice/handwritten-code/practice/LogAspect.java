@Aspect
@Component
public class LogAspect {

    private static final Logger log = LoggerFactory.getLogger(LogAspect.class);

    // 切入点：com.dcp.controller 包下所有 public 方法
    @Around("execution(* com.dcp.controller..*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        // 方法名
        String methodName = joinPoint.getSignature().getName();

        log.info(">>> 调用 {}，参数：{}", methodName, joinPoint.getArgs());

        Object result = joinPoint.proceed(); // 执行目标方法

        long cost = System.currentTimeMillis() - start;
        log.info("<<< {} 返回，耗时 {}ms", methodName, cost);

        return result;
    }
}