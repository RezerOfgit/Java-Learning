package com.rezero.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 * 反向引用
 */
public class RegExp12 {
    public static void main(String[] args) {
        String content = "hello66666 jack5225 tom11 jack22 12321-333999111yyy 1551xxx";

        //要匹配两个连续的相同数字：(\\d)\\1
//        String regStr = "(\\d)\\1";//: \\d表示一位数字, \\1表示重复前面的数字, 故是2位一样的数字

        //要匹配五个连续的相同数字: (\d)\1{4}
//        String regStr = "(\\d)\\1{4}";

        //要匹配个位与千位相同，十位与百位相同的数5225，1551   (\d)(\d)\2\1
//        String regStr = "(\\d)(\\d)\\2\\1";

        /**
         * 请在字符串中检索商品编号，形式如：12321-333999111 这样的号码，
         * 要求满足前面是一个五位数，然后一个号，然后是一个九位数，连续的每三位要相同
         */
        String regStr = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
