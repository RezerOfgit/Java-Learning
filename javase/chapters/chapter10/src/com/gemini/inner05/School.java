package com.gemini.inner05;

public class School {
    private String teacher = "王老师";
    private static String schoolName = "清华大学";
    static class Library{
        public void read(){
            System.out.println(schoolName);
            //System.out.println(teacher);不可打印teacher,因为不是static变量
        }
    }

}
