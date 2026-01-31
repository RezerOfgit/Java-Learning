// 需求： 编写 MethodExercise01.java：
// 核心逻辑：
// 创建一个新的 Person 对象（比如叫 newP）。
// 把传入的 p 的 name 和 age，赋值 给 newP。
// 返回 newP。
// 测试 (Main)：
// 创建 p1，名字 "米开朗基罗"，年龄 18。
// 调用 copyPerson 得到 p2。
// 验证独立性：
// 打印 p1 和 p2 的地址是否一样？（提示：用 p1 == p2 判断，
// 如果返回 false 说明是两个独立房间）。
// 修改 p2 的名字，看 p1 会不会变（如果不变，说明克隆成功！）。


public class MethodExercise05{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.name = "米开朗琪罗";
		p1.age = 18;

		Mytools tools = new Mytools();
		Person p2 = tools.copyPerson(p1);

		System.out.println("p1的属性 name = " + p1.name + "\tage = " + p1.age);
		System.out.println("p2的属性 name = " + p2.name + "\tage = " + p2.age);
		System.out.println(p1 == p2);
		
	}
}

class Person{
	String name;
	int age;
}
class Mytools{
	//思路
	//1.方法的返回类型 Person
	//2.方法的名字 copyPerson
	//3.方法的形参 (Person p)
	//方法体，创建一个新对象，并复制属性，返回即可
	public Person copyPerson(Person p){
		//创建一个新对象
		Person newP = new Person();
		newP.name = "jack";
		newP.age = p.age;
		return newP;
	}
}