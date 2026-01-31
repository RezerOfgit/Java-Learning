package com.hspedu.gemini_.task01;

/**
 * @author Re-zero
 * @version 1.0
 */
public class WeaponFactory {
    public static Sword getSword(){
        return new Sword();
    }
    public static Bow getBow(){
        return new Bow();
    }
}
