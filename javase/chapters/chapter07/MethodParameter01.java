public class MethodParameter01{
	public static void main(String[] args){
		int a = 10;
		int b = 20;

		AA obj = new AA();
		obj.swap(a, b);
		System.out.println("main方法中：\na=" + a + "\tb=" + b);
	}
}

class AA{
	//思路
	//1.方法的返回类型 void
	//2.方法的名字 swap
	//3.方法的形参 (int a, int b)
	//方法体

	public void swap(int a, int b){
		System.out.println("交换前：\na=" + a + "\tb=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("交换后：\na=" + a + "\tb=" + b);
		return;
	}

}