// 测试 (Main)：
// p1 = new Person("史密斯"); -> 打印 p1 的信息（预期：史密斯, 18）。
// p2 = new Person("玛丽", 20); -> 打印 p2 的信息（预期：玛丽, 20）。
// (提示：这就是利用参数列表的不同，让 Java 自动选择用哪个“模具”来造人。)
// 来试试这个“多模具”生产线吧！

public class ConstructorExercise02{
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
	public Person(String pName){
		name = pName;
		age = 18;
	}

	public Person(String pName, int pAge){
		System.out.println("构造器被调用~~完成对象的属性的初始化");
		name = pName;
		age = pAge;
	}
}