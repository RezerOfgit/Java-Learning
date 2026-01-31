package com.gemini.test;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Test {
        public static int test() {
            try {
                System.out.println("A. 准备返回");
                return 1; // 此时打算返回 1
            } catch (Exception e) {
                System.out.println("B. 出错了");
                return 0;
            } finally {
                System.out.println("C. 我一定要执行");
            }
        }
//A,C,(1),D,result = 1
        public static void main(String[] args) {
            int result = test();
            System.out.println("D. 拿到结果：" + result);
        }
    }