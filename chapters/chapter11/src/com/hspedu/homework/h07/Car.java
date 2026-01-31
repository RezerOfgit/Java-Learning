package com.hspedu.homework.h07;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Car {
    private double temperature;
    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("开始吹冷气");
            } else if (temperature < 0) {
                System.out.println("开始吹暖气");
            } else {
                System.out.println("空调已关闭");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
