package com.gemini.supplement_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Supplement10 {
    public static void main(String[] args) {
        List src = new ArrayList();
        src.add("A");
        src.add("B");

        List dest = new ArrayList(); // 🔴 注意这里，刚new出来size是0

        Collections.copy(dest, src); // 试图拷贝
    }
}
