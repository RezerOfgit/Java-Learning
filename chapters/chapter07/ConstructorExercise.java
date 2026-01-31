// 在前面定义的Person类中添加两个构造器：
// 第一个无参构造器：利用构造器设置所有人的age属性初始值都为18
// 第二个带pName和pAge两个参数的构造器：使得每次创建Person对象的同时初始化对象的
// age属性值和name属性值。分别使用不同的构造器，创建对象
public class ConstructorExercise{
	public static void main(String[] args){
		Person p1 = new Person();
		Person p2 = new Person("smith", 80);
		System.out.println("p1的信息如下：");
		System.out.println("p1 对象name= " + p1.name);
		System.out.println("p1 对象age= " + p1.age);	
		System.out.println("p2的信息如下：");
		System.out.println("p2 对象name= " + p2.name);
		System.out.println("p2 对象age= " + p2.age);
	}
}
class Person{
	String name;
	int age;
	//构造器
	//1.构造器没有返回值，也不能写void
	//2.构造器的名称和类Person一样
	//3.(String pName, int pAge) 是构造器形参列表，规则和成员方法一样
	public Person(){
		age = 18;
	}

	public Person(String pName, int pAge){
		System.out.println("构造器被调用~~完成对象的属性的初始化");
		name = pName;
		age = pAge;

	}
}