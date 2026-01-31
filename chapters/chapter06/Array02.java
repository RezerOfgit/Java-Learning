
import java.util.Scanner;
public class Array02{
	public static void main(String [] args){
		//1.创建一个数组
		double[] scores = new double [5];

		//2.创建描述对象
		Scanner myScanner = new Scanner (System.in);

		//3.for 输入数据
		for (int i = 0; i < scores.length; i++){
			System.out.println("请输入第" + (i + 1) + "个元素的值=");
			scores[i] = myScanner.nextDouble();
		}

		//输出，遍历数组
		
		System.out.println("==数组的元素/值的情况如下：===");
		for (int i = 0; i < scores.length; i++){
			System.out.println("第" + (i + 1) + "个元素的值=" + scores[i]);
		}
	}
}