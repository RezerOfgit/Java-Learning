package com.rezero.regexp;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 * 分析java的正则表达式的底层实现（重要.）
 */
public class RegTheory {
    public static void main(String[] args) {
        String content = "1998年12月8日，第二代Java平台的企业版J2EE发布。" +
                "1999年6月，Sun公司发布了第二代Java平台（简称为Java2）的3个版本：" +
                "J2ME（Java2 Micro Edition，Java2平台的微型版），应用于移动、" +
                "无线及有限资源的环境；J2SE（Java 2 Standard Edition，Java 2平台的标准版），" +
                "应用于桌面环境；J2EE（Java 2Enterprise Edition，Java 2平台的企业版），" +
                "应用于基于Java的应用服务器。Java 2平台的发布，是Java发展过程中最重要的" +
                "一个里程碑，标志着Java的应用开始普及。";
        //目标：匹配所有四个数字
        //说明
        //1. \\d 表示一个任意的数字
        String regStr = "\\d\\d\\d\\d";
        //2. 创建模式对象[即正则表达式对象]
        Pattern pattern = Pattern.compile(regStr);
        //3. 创建匹配器
        //说明：创建匹配器matcher， 按照正则表达式的规则去匹配content 字符串
        Matcher matcher = pattern.matcher(content);
        //4. 开始匹配
        /**
         *
         * matcher.find() 完成的任务
         * 1. 根据指定的规则,定位满足规则的子字符串(比如1998)
         * 2. 找到后,将 子字符串的开始的索引记录到 matcher对象的属性 int[] groups;
         *    groups[0] =0,把该子字符串的结束的索引+1的值记录到 groups[1] =4
         * 3. 同时记录oldLast 的值为子字符串的结束的索引+1 的值即35, 即下次执行find 时，就从35 开始匹配
         *
         * matcher.group(0) 分析
         * 源码:
         *     public String group(int group) {
         *         if (first < 0)
         *             throw new IllegalStateException("No match found");
         *         if (group < 0 || group > groupCount())
         *             throw new IndexOutOfBoundsException("No group " + group);
         *         if ((groups[group*2] == -1) || (groups[group*2+1] == -1))
         *             return null;
         *         return getSubSequence(groups[group * 2], groups[group * 2 + 1]).toString();
         *     }
         * 1. 根据 groups[0]=0 和 groups[1]=4 的记录的位置,从content开始截取子字符串返回
         *    就是[0,4)包含 0 但是不包含索引为4的位置
         *
         *  如果再次指向 find 方法, 仍然按照上面分析来执行
         */
        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }

    //分组情况
    @Test
    public void regTheory() {
        String content = "1998年12月8日，第二代Java平台的企业版J2EE发布。" +
                "1999年6月，Sun公司发布了第二代Java平台（简称为Java2）的3个版本：" +
                "J2ME（Java2 Micro Edition，Java2平台的微型版），应用于移动、" +
                "无线及有限资源的环境；J2SE（Java 2 Standard Edition，Java 2平台的标准版），" +
                "应用于桌面环境；J2EE（Java 2Enterprise Edition，Java 2平台的企业版），" +
                "应用于基于Java的应用服务器。Java 2平台的发布，是Java发展过程中最重要的" +
                "一个里程碑，标志着Java的应用开始普及。";
        //目标：匹配所有四个数字
        //说明
        //1. \\d 表示一个任意的数字
        String regStr = "(\\d\\d)(\\d\\d)";
        //2. 创建模式对象[即正则表达式对象]
        Pattern pattern = Pattern.compile(regStr);
        //3. 创建匹配器
        //说明：创建匹配器matcher， 按照正则表达式的规则去匹配content 字符串
        Matcher matcher = pattern.matcher(content);
        //4. 开始匹配
        /**
         *
         * matcher.find() 完成的任务 (考虑分组)
         * 什么是分组，比如(\d\d)(\d\d) ,正则表达式中有() 表示分组,第1 个()表示第1 组,第2 个()表示第2 组...
         * 1. 根据指定的规则,定位满足规则的子字符串(比如(19)(98))
         * 2. 找到后,将 子字符串的开始的索引记录到 matcher对象的属性 int[] groups;
         *    2.1 groups[0] =0,把该子字符串的结束的索引+1的值记录到 groups[1] =4
         *    2.2 记录1 组()匹配到的字符串groups[2] = 0 groups[3] = 2
         *    2.3 记录2 组()匹配到的字符串groups[4] = 2 groups[5] = 4
         *    2.4 如果有更多的分组.....
         * 3. 同时记录oldLast 的值为子字符串的结束的索引+1 的值即35, 即下次执行find 时，就从35 开始匹配
         *
         * matcher.group(0) 分析
         * 源码:
         *     public String group(int group) {
         *         if (first < 0)
         *             throw new IllegalStateException("No match found");
         *         if (group < 0 || group > groupCount())
         *             throw new IndexOutOfBoundsException("No group " + group);
         *         if ((groups[group*2] == -1) || (groups[group*2+1] == -1))
         *             return null;
         *         return getSubSequence(groups[group * 2], groups[group * 2 + 1]).toString();
         *     }
         * 1. 根据 groups[0]=0 和 groups[1]=4 的记录的位置,从content开始截取子字符串返回
         *    就是[0,4)包含 0 但是不包含索引为4的位置
         *
         *  如果再次指向 find 方法, 仍然按照上面分析来执行
         */
        while (matcher.find()) {
            //小结
            //1. 如果正则表达式有() 即分组
            //2. 取出匹配的字符串规则如下
            //3. group(0) 表示匹配到的子字符串
            //4. group(1) 表示匹配到的子字符串的第一组字串
            //5. group(2) 表示匹配到的子字符串的第2 组字串
            //6. ... 但是分组的数不能越界.
            System.out.println("找到: " + matcher.group(0));
            System.out.println("第1组()匹配到的值=" + matcher.group(1));
            System.out.println("第2组()匹配到的值=" + matcher.group(2));
            System.out.println("第3组()匹配到的值=" + matcher.group(3));//越界无效
        }
    }
}
