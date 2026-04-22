package com.rezero.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 * 演示正则表达式的使用
 */
public class RegExp11 {
    public static void main(String[] args) {

//        String content = "https://www.bilibili.com/video/BV1fh411y7R8?spm_id_from=333.788.player.switch&vd_source=29fa1d32764caf8a7e5b004f4413d800&p=894";
        String content = "https://military.china.com/news/13004177/20260327/49361790.html";

        /**
         * 思路
         * 1. 先确定url 的开始部分https:// | http://
         * 2.然后通过([\w-]+\.)+[\w-]+ 匹配www.bilibili.com
         * 3. /video/BV1fh411y7R8?from=sear 匹配(\/[\w-?=&/%.#]*)?
         */

        String regStr = "^((https|http)://)([\\w-.])+[\\w]+(\\/[\\w-?=&/%.#]*)?$";
        //注意：[. ? *]表示匹配就是本身

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }

        //这里如果使用Pattern的matches 整体匹配 比较简洁
        System.out.println(Pattern.matches(regStr,content));
    }
}
