public class Overload04{
	public static void main(String[] args){
		MyCalculator cal = new MyCalculator();

		System.out.println(cal.calculate(5));
		System.out.println(cal.calculate(2, 10));
		System.out.println(cal.calculate("加薪", 100.5));
	}
}
class MyCalculator{
	public int calculate(int n){
		return n * n;
	}
	public int calculate(int n1, int n2){
		return n1 * n2;
	}
	public double calculate(String msg, double d){
		System.out.println("收到指令：" + msg + " 开始计算...");
		return d + 10.0;
	}
	
}