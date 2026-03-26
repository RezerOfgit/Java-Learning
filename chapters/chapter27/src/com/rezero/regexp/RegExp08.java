package com.rezero.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 * 演示非捕获分组, 语法比较奇怪
 */
public class RegExp08 {
    public static void main(String[] args) {
        String content = "hello 韩顺平教育jack 韩顺平老师韩顺平同学hello 韩顺平学生";

        // 找到韩顺平教育、韩顺平老师、韩顺平同学子字符串
//        String regStr = "韩顺平教育|韩顺平老师|韩顺平同学";
        //上面的写法可以等价非捕获分组, 注意：不能matcher.group(1)
//        String regStr = "韩顺平(?:教育|老师|同学)";

        //找到韩顺平这个关键字,但是要求只是查找韩顺平教育和韩顺平老师中包含有的韩顺平
        //下面也是非捕获分组，不能使用matcher.group(1)
//        String regStr = "韩顺平(?=教育|老师)";

        //找到韩顺平这个关键字,但是要求只是查找不是(韩顺平教育和韩顺平老师) 中包含有的韩顺平
        //下面也是非捕获分组，不能使用matcher.group(1)
        String regStr = "韩顺平(?!教育|老师)";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group());
        }
    }
}
