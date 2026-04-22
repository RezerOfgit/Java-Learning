package com.gemini.task_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task02 {
    public static void main(String[] args) {
        DownloadTask downloadTask = new DownloadTask();
        downloadTask.start();
    }
}
class DownloadTask extends Thread {
    int times = 0;
    @Override
    public void run() {

        while (true) {
            System.out.println("正在下载... 已完成" + (++times) * 10 + "%");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 10) {
                System.out.println("下载结束，文件已保存！");
                break;
            }
        }
    }
}