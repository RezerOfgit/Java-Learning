package com.gemini.single_;

public class Task05 {
}
class Cat{
    private static Cat cat;

        private Cat(){

    }
    public static Cat getInstance(){
        if (cat == null){
            cat = new Cat();
        }
        return cat;
    }
}