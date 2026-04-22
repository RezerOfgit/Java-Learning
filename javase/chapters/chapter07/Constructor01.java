public class Constructor01{
	public static void main(String[] args){
		Person p1 = new Person("smith", 80);
		System.out.println("p1的信息如下：");
		System.out.println("p1 对象name= " + p1.name);
		System.out.println("p1 对象age= " + p1.age);
	}
}
class Person{
	String name;
	int age;
	//构造器
	//1.构造器没有返回值，也不能写void
	//2.构造器的名称和类Person一样
	//3.(String pName, int pAge) 是构造器形参列表，规则和成员方法一样
	public Person(String pName, int pAge){
		System.out.println("构造器被调用~~完成对象的属性的初始化");
		name = pName;
		age = pAge;

	}
}