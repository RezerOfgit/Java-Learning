public class Overload03{
	public static void main(String[] args){
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1, 2));
		System.out.println(mc.calculate(1, 2.1));
		System.out.println(mc.calculate(1.1, 2));
		System.out.println(mc.calculate(1, 2, 5));
		
	}
}
class MyCalculator{
	//下面4个calculate方法构成了重载
	//两个整数的和
	public int calculate(int n1, int n2){
		System.out.println("calculate(int n1, int n2)被调用");
		return n1 + n2;
	}
	//没有构成方法重载，仍然是错误的，因为是方法的重复定义
	// public int calculate(int n1, int n2){
	// 	System.out.println("calculate(int n1, int n2)被调用");
	// 	return res = n1 + n2;
	// }
	
	// 也没构成，而是方法的重复定义
	// public int calculate(int a1, int a2){
	// 	System.out.println("calculate(int a1, int a2)被调用");
	// 	return a1 + a2;
	// }
	//一个整数，一个double 的和
	public double calculate(int n1, double n2){
		System.out.println("calculate(int n1, double n2)被调用");
		return n1 + n2;
	}
	//一个double, 一个int和
	public double calculate(double n1, int n2){
		System.out.println("calculate(double n1, int n2)被调用");
		return n1 + n2;
	}
	//3个int 的和
	public int calculate(int n1, int n2, int n3){
		System.out.println("calculate(int n1, int n2, int n3)被调用");
		return n1 + n2 + n3;
	}
}