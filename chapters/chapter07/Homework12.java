// 12.创建一个Employee类，属性有（名字，性别，年龄，职位，薪水），
// 提供3个构造方法，可以初始化（1）（名字，性别，年龄，职位，薪水），
// （2）（名字，性别，年龄）（3）（职位，薪水），要求充分复用构造器

public class Homework12{
    public static void main(String[] args){
    	Employee employee = new Employee("jack", "男", 20, "工程师", 8000);
    	employee.getInfo();
    }
}

class Employee{
	String name;
	String gender;
	int age;
	String position;
	double salary;

	//构造器
	public Employee(String position, double salary){
		this.position = position;
		this.salary = salary;
	}

	public Employee(String name, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Employee(String name, String gender, int age,
					String position, double salary){
		this(name, gender, age);
		//this(position, salary);
		// this.name = name;
		// this.gender = gender;
		// this.age = age;
		this.position = position;
		this.salary = salary;
	}
	
	public void getInfo(){
		System.out.println(name + "性别是" + gender + "，年龄是" + 
			age + "，职位是" + position + "，薪水是" + salary);
	}
}