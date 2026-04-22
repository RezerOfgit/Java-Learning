// 请编写 This02.java，修改刚才的 Person 类：
// 保留那个“全能构造器” (name, age 两个参数的)。
// 修改那个“简单构造器” (name 一个参数的)：
// 删掉里面的赋值代码。
// 改为使用 this(...) 语法，直接调用上面的“全能构造器”。
// 传进去的年龄固定写死为 18。
public class This02{
    public static void main(String[] args){
        Person p1 = new Person("史密斯");
        Person p2 = new Person("玛丽", 20);
        System.out.println("p1的信息如下：名字是：" + p1.name + 
            " 年龄是：" + p1.age);
        System.out.println("p2的信息如下：名字是：" + p2.name + 
            " 年龄是：" + p2.age);
    }
}
class Person{
    String name;
    int age;
    //构造器
    //1.构造器没有返回值，也不能写void
    //2.构造器的名称和类Person一样
    //3.(String pName, int pAge) 是构造器形参列表，规则和成员方法一样
    public Person(String name) {
        // 这里只能写一行代码，把活派给另一个构造器
        this(name, 18);
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}