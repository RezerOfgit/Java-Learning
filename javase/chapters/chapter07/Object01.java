public class Object01{
	public static void main(String[] args){
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";

		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 10;
		cat2.color = "花色";

		System.out.println("第1只猫的信息：" + cat1.name + " " +
			cat1.age + " " + cat1.color);
		System.out.println("第2只猫的信息：" + cat2.name + " " + 
			cat2.age + " " + cat2.color);
	}
}
class Cat{
	String name;
	int age;
	String color;
}