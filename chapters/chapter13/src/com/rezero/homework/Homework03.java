package com.rezero.homework;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Homework03 {
    /**
     * (1) 编写java程序，输入形式为：Han Shun Ping的人名，以Ping,Han.S的形式打印
     * 出来。其中.S是中间单词的首字母。
     * (2) 例如输入"Willian Jefferson Clinton"，输出形式为：Clinton,Willian .J
     * @param args
     */
    public static void main(String[] args) {
        nameFormat("Han Shun Ping");
        nameFormat("Willian Jefferson Clinton");
    }
    public static void nameFormat(String name){
        //对输入的参数做一个验证
        //(1) 写出正确的情况
        //(2) 然后取反即可

        if (name == null) {
            System.out.println("name 不能为空");
            return;
        }

        String[] tempName = name.split(" ");
        if (tempName.length != 3){
            System.out.println("输入的名字格式不对");
            return;
        }

        String format = String.format("%s,%s.%c", tempName[2], tempName[0], tempName[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
