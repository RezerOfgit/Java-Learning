package com.hspedu.gemini_;

/**
 * @author Re-zero
 * @version 1.0
 */
enum Color { RED, BLUE }

public class Test02 {
    public void check(String inputColor) {
        // 假设 inputColor 是用户输入的 "RED"
        // ❌ 这里的判断有隐患，请重写 if 括号里的条件
        if ("RED".equals(inputColor)) {
            System.out.println("是红色");
        }
    }
}
//// 假设枚举是这样定义的
//enum Color { RED, BLUE }
//
//public class Test {
//    public void check(String inputColor) {
//        // 1. 使用 valueOf 进行转换
//        // 语法：枚举类名.valueOf("字符串");
//        try {
//            Color color = Color.valueOf(inputColor);
//
//            // 2. 现在可以用安全的 == 来比较了
//            if (color == Color.RED) {
//                System.out.println("是红色");
//            }
//        } catch (IllegalArgumentException e) {
//            // 如果用户输入了 "PURPLE" (枚举里没有)，这里会报错，需要小心处理
//            System.out.println("输入颜色不对，没有这个枚举！");
//        }
//    }
//}