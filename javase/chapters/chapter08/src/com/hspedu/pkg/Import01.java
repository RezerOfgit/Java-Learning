package com.hspedu.pkg;

import java.util.Arrays;
//注意
//需要使用到哪个类，就导入哪个类即可，不建议使用*导入
//import java.util.Scanner;//表示只会引入java util 包下的Scanner
//import java.util.*;//表示将java util 包下的所有类都引入（导入）

public class Import01 {
    public static void main(String[] args) {
        //使用系统提供 Arrays 完成数组排序
        int[] arr = {-1, 20, 2, 13,3};
        //传统方法是自己编写排序（冒泡）
        Arrays.sort(arr);
        //输出排序结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
