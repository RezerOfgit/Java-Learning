package com.thread_pool;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Re-zero
 * @version 1.0
 */
public class EmailNotificationTask {
    public static void main(String[] args) {
        ArrayList<String> colleges = new ArrayList<>();
        colleges.add("化学系");
        colleges.add("生物系");
        colleges.add("物理系");
        colleges.add("医学部");
        colleges.add("材料学院");

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (String college : colleges) {
            executor.submit(()->{
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在向 <化学系> 发送预警邮件..." + college);
            });
        }

        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdown();
            }
        } catch (InterruptedException e) {
            executor.shutdown();
            Thread.currentThread().interrupt();
        }
        System.out.println("所有邮件发送任务已完成，线程池已关闭。");
    }
}
