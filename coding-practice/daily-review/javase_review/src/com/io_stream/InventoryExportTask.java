package com.io_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 */
public class InventoryExportTask {
    public static void main(String[] args) {
        String[] reportData = {"10ul移液器枪头 - 剩余45个", "50ml离心管 - 剩余25个", "无菌棉签 - 剩余10包"};

        String filePath = "D:\\Java_IO_Base\\low_stock_report.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String reportDatum : reportData) {
                writer.write(reportDatum);
                writer.newLine();
            }
            System.out.println("数据已经成功写入文件: " + filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
