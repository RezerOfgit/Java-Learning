package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task23 {
    public static void checkAge(int age){
        if (!(age >= 18 && age <= 120)){
            throw new AgeException("年龄不合法!");
        }else {
            System.out.println("年龄通过");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(250);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}