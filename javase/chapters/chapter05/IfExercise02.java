//2.编写程序，声明2个double型变量并赋值。
//判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。
public class IfExercise02{
	//编写一个main方法
	public static void main(String [] args){
		double x = 15.3;
		double y = 8.1;
		if (x > 10.0 & y < 20.0){
			System.out.println("两数之和为：" + (x + y));
		} 
		// else 
		// System.out.println("x is" + x);
	}
}