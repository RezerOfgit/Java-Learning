package com.hspedu.poly_.exercise_;

public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4;
        long I = (long) d;
        System.out.println(I);

        int in = 5;
        //boolean b = (boolean)in;//错误，int类型不能转换为boolean类型

        Object obj = "Hello";
        String objStr = (String) obj;
        System.out.println(objStr);

        Object objPri = new Integer(5);
        String str = (String) objPri;//错误,指向Integer的父类引用，转成String
        Integer str1 = (Integer) objPri;//正确，向下转型
    }
}
