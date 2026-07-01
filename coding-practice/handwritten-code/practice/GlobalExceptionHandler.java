@RestControllerAdvice
public class GlobalExceptionHandler {

    // 业务异常
    @ExceptionHandler(BusinessException.class)
    public Result<Void> handleBusiness(BusinessException e) {
        return Result.error(500, e.getMessage());
    }

    // 参数校验异常
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<Void> handleValidation(MethodArgumentNotValidException e) {
        String msg = e.getBindingResult().getAllErrors().get(0).getDefaultMessage();
        return Result.error(400, msg);
    }

    // 兜底异常
    @ExceptionHandler(Exception.class)
    public Result<Void> handleException(Exception e) {
        // 记日志：log.error("系统异常", e);
        return Result.error(500, "系统异常");
    }
}