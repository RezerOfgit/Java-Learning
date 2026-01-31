// 1.编写程序，类Methods中定义三个重载方法并调用。
// 方法名为m。三个方法分别接收一个int参数、两个int参数、一个字符串参数。
// 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
// 在主类的main0方法中分别用参数区别调用三个方法。

public class OverLoadExercise{
	public static void main(String[] args){
		Methods me = new Methods();

		System.out.println(me.m(2));
		System.out.println(me.m(2, 5));
		System.out.println(me.m("你好"));
	}
}
class Methods{
	//接收一个int参数
	public int m(int n1){
		System.out.println("m(int n1)被调用");
		return n1 * n1;
	}
	public int m(int n1, int n2){
		System.out.println("m(int n1, int n2)被调用");
		return n1 * n2;
	}
	public String m(String n1){
		System.out.println("m(String n1)被调用");
		return n1;
	}
}
