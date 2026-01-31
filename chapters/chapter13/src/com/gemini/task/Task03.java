package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task03 {
    public static void main(String[] args) {
        String text = "";
        long startTime = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder(10000);

        // ❌ 低效写法：在循环中疯狂创建 String 对象
        for (int i = 0; i < 10000; i++) {
            builder.append("text");
            //text = text + i;
        }
        String result = builder.toString();
        System.out.println(text);
        long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime));
    }
}
