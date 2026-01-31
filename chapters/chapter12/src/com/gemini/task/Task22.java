package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task22 {
    // 1. 小弟：我不管，我有错就往上抛
    public static void worker() throws ArithmeticException {
        int i = 10 / 0; // 炸了
    }

    // 2. 经理：我也不管，我也往上抛
    public static void manager() throws ArithmeticException {
        worker();
    }

    // 3. 这里的 main 方法选择了“负责任” (try-catch)
    public static void main(String[] args) {
        try {
            manager();//ArithmeticException->catch():B. 捕获到经理甩来的锅,C
            System.out.println("A. 经理任务完成");
        } catch (Exception e) {
            System.out.println("B. 捕获到经理甩来的锅");
        }
        System.out.println("C. 全剧终");
    }
}
