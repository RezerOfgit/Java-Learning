package com.hspedu.extend_;
/*案例3 ExtendsExercise03.java
        编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法用于返回
        Computer的详细信息
        编写PC子类，继承Computer类，添加特有属性【品牌brand】
        编写NotePad子类，继承Computer类，添加特有属性【color】
        编写Test类，在main方法中创建PC和NotePad对象，分别给对象中特有的属性
        赋值，以及从Computer类继承的属性赋值，并使用方法并打印输出信息。*/
public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC01 pc01 = new PC01("Intel", 16, 512, "IBM");
        pc01.printInfo();
        NotePad notePad = new NotePad("Intel", 16, 512, "white");
        notePad.printInfo();
    }
}
class Computer01{
    private String CPU;
    private int memory;
    private int disk;

    public Computer01(String CPU, int memory, int disk) {
        this.CPU = CPU;
        this.memory = memory;
        this.disk = disk;
    }

    public String getDetails() {
        return "Computer的详细信息:" + CPU + memory + disk;
    }
}
class PC01 extends Computer01{
    public String brand;

    public PC01(String CPU, int memory, int disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("PC信息=");
        System.out.println(getDetails() + brand);
    }
}
class NotePad extends Computer01{
    public String color;

    public NotePad(String CPU, int memory, int disk, String color) {
        super(CPU, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void printInfo(){
        System.out.println("NotePad信息=");
        System.out.println(getDetails() + color);
    }
}