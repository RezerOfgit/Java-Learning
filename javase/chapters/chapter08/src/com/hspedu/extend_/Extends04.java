package com.hspedu.extend_;

public class Extends04 {
    public static void main(String[] args) {
        PC pc = new PC("Intel", 16, 512, "IBM");
        System.out.println(pc.printInfo());
    }
}
class Computer{
    private String cpu;
    private int memory;
    private int disk;

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public int getMemory() {
        return memory;
    }

    public int getDisk() {
        return disk;
    }

}
class PC extends Computer{
    public String brand;

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }
    public String printInfo(){
        return "品牌是" + brand + "详细配置是:\ncpu:" + getCpu() +
                "\n内存:" + getMemory() + "\n储存:" + getDisk();
    }
}
