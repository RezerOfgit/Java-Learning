package com.gemini.task;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task25 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
// 1. 动作：把文件里的数据“搬运”到集合中
        prop.load(new FileReader("src/mysql.properties"));

// 2. 动作：根据 key 拿 value (注意：不要用 get，要用特有的 String 专用方法)
        String ip = prop.getProperty("ip");
    }
}
