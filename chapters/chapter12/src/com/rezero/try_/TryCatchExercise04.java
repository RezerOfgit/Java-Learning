package com.rezero.try_;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 */
public class TryCatchExercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while (true){
            System.out.println("请输入一个整数:");
            inputStr = scanner.next();
            try {
                num = Integer.parseInt(inputStr);
                break;
            }catch (NumberFormatException e){
                System.out.println("你输入的不是整数,请重新输入");
            }
        }
//        System.out.println("请输入一个整数:");
//        int num;
//        while (true) {
//            try {
//                num = scanner.nextInt();
//                break;
//            } catch (InputMismatchException e) {
//                System.out.println("你输入的不是整数,请重新输入");
//                scanner.nextLine();
//            }
//        }
        System.out.println("输入的值 = " + num);
    }
}
