package com.gemini.abstract_;

abstract public class Template {
    private String name;
    public abstract void job();
    public void calculateTime(){
        System.out.println("开始工作");
        job();
        System.out.println("工作结束");
    }
    public Template(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
