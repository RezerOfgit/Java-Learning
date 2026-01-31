package com.hspedu.abstract_;

public class Abstract01 {
    public static void main(String[] args) {
        CommonEmployee jack = new CommonEmployee("jack", "1234", 8000);
        Manager tom = new Manager("tom", "1001", 15000, 50000);
        jack.work();
        tom.work();
    }
}
