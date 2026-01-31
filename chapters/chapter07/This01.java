// 修改类 Person：
// 将构造器的参数名 pName 改为 name。
// 将构造器的参数名 pAge 改为 age。
// 使用 this：
// 在构造器内部，使用 this.name = name 的方式来赋值。
// (那个只传名字的构造器，也要改哦！age = 18 前面加不加 this 都可以，
// 但建议加上 this.age = 18 养成好习惯)。
// 测试：
// 运行结果必须和上一题完全一样，证明你成功区分了“参数”和“属性”。
// (提示：输入 . 的时候，IDEA/编辑器通常会提示出属性，这就是 this 的魔法。)
public class This01{
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
    public Person(String name){
        this.name = name;
        this.age = 18;
    }

    public Person(String name, int age){
        System.out.println("构造器被调用~~完成对象的属性的初始化");
        this.name = name;
        this.age = age;
    }
}