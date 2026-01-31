// 11.在测试方法中，调用method方法，代码如下，编译正确，
// 试写出method方法的定义形式，调用语句为：
// System.out.println(method(method(10.0，20.0),100));
public class Homework11{
    public static void main(String[] args){
    	method m1 = new method();
    	System.out.println(m1.method(m1.method(10.0, 20.0), 100));
    }
}
class method{
	public double method(double num1, double num2){
		return num1 + num2;
	}
}

// public class Test {
//     public static void main(String[] args) {
//         System.out.println(method(method(10.0, 20.0), 100));
//     }

//     // 定义 method 方法
//     public static double method(double a, double b) {
//         return a + b; // 可以是任意合法的 double 运算
//     }
// }