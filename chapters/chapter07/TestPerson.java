// 定义Person类，里面有name、age属性，并提供compareTo比较方法，
// 用于判断是否和另一个人相等，提供测试类TestPerson用于测试，
// 名字和年龄完全一样，就返回true，否则返回false

public class TestPerson{
    public static void main(String[] args){
        Person p1 = new Person("tom", 16);
        Person p2 = new Person("tom", 16);
        
        System.out.println("p1和p2比较的结果=" + p1.compareTo(p2));
    }
}
class Person{
    String name = "jack";
    int age = 18;
    //构造器
    //1.构造器没有返回值，也不能写void
    //2.构造器的名称和类Person一样
    //3.(String pName, int pAge) 是构造器形参列表，规则和成员方法一样
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //compareTo比较方法
    public boolean compareTo(Person p){
        // //名字和年龄完全一样
        // if((this.name).equals(p.name) && this.age == p.age){
        //     return true;
        // }else {
        //     return false;
        // }
        return (this.name).equals(p.name) && this.age == p.age;
    }
}