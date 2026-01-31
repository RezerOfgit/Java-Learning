package com.gemini.abstract_;

public class Manager extends Template{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void job() {
        System.out.println("经理的工作：天天开会，管理员工");
    }
}
