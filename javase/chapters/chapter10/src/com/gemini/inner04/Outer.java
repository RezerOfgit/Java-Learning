package com.gemini.inner04;

public class Outer {
    private int n1 = 100;
    class Inner{
        private int n1 = 200;
        public void show(int n1){
            System.out.println(n1);
            System.out.println(this.n1);
            System.out.println(Outer.this.n1);
        }
    }
}
