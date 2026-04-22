package com.gemini.supplement_;

import java.util.ArrayList;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Supplement03 {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // 试图把 list2 赋值给 list1
        // 也就是想把“一箱苹果”当成“一箱水果”来处理
        //list1 = list2;
        /*
        思考： 这行代码 list1 = list2; 会报错吗？(Yes
        (如果报错，说明泛型之间不具备继承性，这也是为什么我们需要通配符 ? 的原因)
         */
    }
}
