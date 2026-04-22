package com.hspedu.Gemini_;

public class Test {
    public static void main(String[] args) {
        String str1 = new String("hello");
        int it = 65;
        char ch1 = 'A';
        char ch2 = 12;
        System.out.println("65和 'A' 是否相等？ " +(it == ch1));
        System.out.println(12 == ch2);
        //System.out.println("hello" == new java.sql.Date());
    }
}
class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}


