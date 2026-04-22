package com.rezero.string_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class StringMethod02 {
    public static void main(String[] args) {
        //1. toUpperCase转换成大写
        String s = "heLLo";
        System.out.println(s.toUpperCase());//HELLO

        //2. toLowerCase转换成小写
        System.out.println(s.toLowerCase());//hello

        //3. concat拼接字符串
        String s1 = "宝玉";
        s1 = s1.concat("林黛玉").concat("薛宝钗").concat("together");
        System.out.println(s1);//宝玉林黛玉薛宝钗together

        //4. replace 替换字符串中的字符
        String s2 = "宝玉 and 林黛玉 林黛玉 林黛玉";
        s2 = s2.replace("林黛玉", "薛宝钗");
        System.out.println(s2);//宝玉 and 薛宝钗 薛宝钗 薛宝钗
        //解读:s2.replace() 方法执行后，返回的结果才是替换过的.
        //注意对 s2 没有任何影响
        String s11 = s2.replace("宝玉", "jack");
        System.out.println(s2);
        System.out.println(s11);

        //5. split 分割字符串，对于某些分割字符，我们需要 转义 比如|\\等
        String poem = "锄禾日当午，汗滴禾下土，谁知盘中餐，粒粒皆辛苦";
        String[] split = poem.split("，");
        System.out.println("===分割后的内容===");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        String poem02 = "E:\\aaa\\bbb";
        String[] split02 = poem02.split("\\\\");
        System.out.println("===分割后的内容===");
        for (int i = 0; i < split02.length; i++) {
            System.out.println(split02[i]);
        }

        //6. toCharArray转换成字符数组
        String s06 = "happy";
        char[] chs = s06.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + " ");
        }
        System.out.println();

        //7. compareTo比较两个字符串的大小，如果前者大,
        //则返回正数，后者大，则返回负数，如果相等，返回0
        //解读:
        //(1) 如果长度相同，并且每个字符也相同，就返回0
        //(2) 如果长度相同或者不相同，但是在进行比较时，可以区分大小
        /* 就返回 if(c1 != c2) {
                    return c1 - c2;
                 }
         */
        //(3) 如果前面的部分都相同，就返回 str1.len - str2.len
        String a = "jcck";// len = 3
        String b = "jack";// len = 4
        System.out.println(a.compareTo(b)); // 返回值是 'c' - 'a' = 2 的值

        //8. format 格式字符串
        /* 占位符有：
         * %s 字符串, %c 字符, %d 整型, %.2f 浮点型.
         */
        String name = "john";
        int age = 10;
        double score = 56.857;
        char gender = '男';
        //将所有的信息都拼接在一个字符串.
        String info = "我的姓名是" + name + "年龄是" + age +
                ",成绩是" + score + "性别是" + gender + "。希望大家喜欢我!";
        System.out.println(info);
        //解读:
        //1. %s ,%d ,%.2f%c 称为占位符
        //2. 这些占位符由后面变量来替换
        //3. %s 表示后面由 字符串来替换
        //4. %d 是整数来替换
        //5. %.2f 表示使用小数来替换，替换后，只会保留小数点两位，并且进行四舍五入的处理
        //6. %c 使用 char 类型来替换
        String formatStr = "我的姓名是%s 年龄是%d，成绩是%.2f 性别是%c.希望大家喜欢我！";
        String info2 = String.format(formatStr, name, age, score, gender);
        System.out.println("info2=" + info2);

    }
}
