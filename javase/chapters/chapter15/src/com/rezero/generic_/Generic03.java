package com.rezero.generic_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Generic03 {
    public static void main(String[] args) {
        //注意,特别强调: E表示 s 的数据类型,该数据类型在定义Person对象的时候指定,
        // 即在编译期间,就确定E是什么类型
        Person<String> person = new Person<String>("java学习");
        person.show();
        /*
        class Person<String> {
            String s;//E表示 s 的数据类型,该数据类型在定义Person对象的时候指定,即在编译期间,
            // 就确定E是什么类型

            public void show(){//显示s的运行类型
                System.out.println(s.getClass());
            }

            public String f(){//返回类型使用E
                return s;
            }

            public Person(String s) {//E可以是参数类型
                this.s = s;
            }
        }
         */
        Person<Integer> person2 = new Person<Integer>(100);
        person2.show();
        /*
        class Person<Integer> {
            Integer s;//E表示 s 的数据类型,该数据类型在定义Person对象的时候指定,即在编译期间,
            // 就确定E是什么类型

            public void show(){//显示s的运行类型
                System.out.println(s.getClass());
            }

            public Integer f(){//返回类型使用E
                return s;
            }

            public Person(Integer s) {//E可以是参数类型
                this.s = s;
            }
        }
         */
    }
}
//泛型的作用是：可以在类声明时通过一个标识表示类中某个属性的类型，
//或者是某个方法的返回值的类型，或者是参数类型
class Person<E> {
    E s;//E表示 s 的数据类型,该数据类型在定义Person对象的时候指定,即在编译期间,
    // 就确定E是什么类型

    public void show(){//显示s的运行类型
        System.out.println(s.getClass());
    }

    public E f(){//返回类型使用E
        return s;
    }

    public Person(E s) {//E可以是参数类型
        this.s = s;
    }
}