package com.gemini.abstract_;

public class Worker extends Template{
    public Worker(String name) {
        super(name);
    }

    @Override
    public void job() {
        System.out.println("工人的工作：努力搬砖，建设祖国");
    }
}
