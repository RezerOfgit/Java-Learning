package com.gemini.supplement_;

/**
 * @author Re-zero
 * @version 1.0
 */
import java.util.ArrayList;

public class DebugTraining {
    public static void main(String[] args) {
        // 1. 在这一行打上【红点断点】
        ArrayList list = new ArrayList();

        // 2. 我们要观察前 11 次添加
        for (int i = 1; i <= 11; i++) {
            list.add(i);
        }
    }
}
