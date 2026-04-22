// 7.设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show()显示其信息。
// 并创建对象，进行测试、【提示this.属性】
public class Homework07{
    public static void main(String[] args){
    	Dog dog = new Dog("小黑", "白色", 5);
    	dog.show();
    }
}
class Dog{
	String name;
	String color;
	int age;

	//构造器
	public Dog(String name, String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show(){
		System.out.println("狗的名字是" + this.name + "，颜色是" + 
			this.color + "，年龄是" + this.age);
	}
}