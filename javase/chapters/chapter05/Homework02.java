// 2.实现判断一个整数，属于哪个范围：大于0；小于0；等于0


import java.util.Scanner;
public class Homework02{
	public static void main(String [] args){

		//1.创建描述对象
		Scanner numScanner = new Scanner (System.in);

		//2.获得用户输入信息
		System.out.println("请输入一个整数：");
		int num = numScanner.nextInt();

		//3.业务核心逻辑，if-else
		if (num > 0){
			System.out.println("这个数大于0");
		}else if(num < 0){
			System.out.println("这个数小于0");
			//break;
		}else{
			System.out.println("这个数等于0");
			//break;
		}
	}
}