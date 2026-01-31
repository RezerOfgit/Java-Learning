// 编写一个方法 testArray，接收一个整型数组 int[] arr 作为参数。
// 在方法内部，修改数组第一个元素：arr[0] = 100;。
// 在 main 方法中：
// 定义数组 int[] myArr = {1, 2, 3};。
// 打印调用前的 myArr[0]。
// 调用 testArray(myArr)。
// 关键点：打印调用后的 myArr[0]。
// 预测一下：最后打印的是 1 还是 100？

public class MethodParameter02{
	public static void main(String[] args){
		int[] myArr = {1, 2, 3};
		AA a = new AA();
		a.testArray(myArr);
		System.out.println(myArr[0]);
	}
}

class AA{
	//思路
	//1.方法的返回类型 void
	//2.方法的名字 testArray
	//3.方法的形参 (int[] arr)
	//方法体，
	public void testArray(int[] arr){
		arr[0] = 100;
	}
}
