package com.hspedu.gemini_.task02;

/**
 * @author Re-zero
 * @version 1.0
 */
public enum Season {
    SUMMER("夏天"),WINTER("冬天");
    private String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
