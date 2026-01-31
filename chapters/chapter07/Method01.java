// Method01.java
// 1）添加speak成员方法，输出“我是一个好人”
// 2）添加cal01成员方法，可以计算从1+..+1000的结果
// 3）添加cal02成员方法，该方法可以接收一个数n，计算从1+..+n的结果
// 4）添加getSum成员方法，可以计算两个数的和
// 
public class Method01{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(5);
		p1.cal02(10);
		int returnRes = p1.getSum(10, 20);
		System.out.println("getSum 方法计算结果=" + returnRes);

	}
}

class Person{
	String name;
	int age;

	public void speak(){
		System.out.println("我是一个好人");
	}

	public void cal01(){
		int res = 0;
		for(int i = 1; i <= 1000; i++){
			res += i;
		}
		System.out.println("cal01 方法计算结果=" + res);
	}

	public void cal02(int n){
		int res = 0;
		for(int i = 1; i <= n; i++){
			res += i;
		}
		System.out.println("cal02 方法计算结果=" + res);
	}

	public int getSum(int num1, int num2){
		int res = num1 + num2;
		return res;
	}	
}