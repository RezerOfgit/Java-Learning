package com.gemini.supplement_;

import java.util.Hashtable;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Supplement07 {
    public static void main(String[] args) {
        new Hashtable().put(null, "abc");//NullPointerException
    }
}
