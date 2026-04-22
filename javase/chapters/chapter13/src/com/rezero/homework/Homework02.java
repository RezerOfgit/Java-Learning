package com.rezero.homework;

import java.util.SplittableRandom;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Homework02 {
    /*
    输入用户名、密码、邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
    要求：
    （1）用户名长度为2或3或4
    （2）密码的长度为6,要求全是数字 isDigital
    （3）邮箱中包含@和.并且@在.的前面
     */
    public static void main(String[] args) {
        String name = "jack";
        String pwd = "123456";
        String email = "jack@sohu.com";
        try {
            userRegister(name, pwd, email);
            System.out.println("恭喜你，注册成功~");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name, String pwd, String email) {
        //对输入的参数做一个验证
        //(1) 写出正确的情况
        //(2) 然后取反即可

        //再加入一些校验
        if(!(name != null && pwd != null && email != null)){
            throw new RuntimeException("参数不能为nuLl");
        }

        //第1关
        if (!(name.length() >= 2 && name.length() <= 4)) {
            throw new RuntimeException("用户名长度为2或3或4");
        }

        //第2关
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码的长度为6, 要求全是数字");
        }

        //第3关
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱中包含@和.并且@在.的前面");
        }
    }

    //单独写一个房东,判断 密码是否全部是数字字符 boolean
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
