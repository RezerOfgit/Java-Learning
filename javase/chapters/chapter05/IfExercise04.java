// 判断一个年份是否是闰年，闰年的条件是符合下面二者之一：
// （1）年份能被4整除，但不能被100整除；（2）能被400整除
import java.util.Scanner;
public class IfExercise04{
	//编写一个main方法
	public static void main(String [] args){
		//1.创建扫描对象
		Scanner yearScanner = new Scanner (System.in);

		//2.获取用户输入
		System.out.println("请输入年份：");
		int year = yearScanner.nextInt();

		//3.核心业务逻辑，判断年份是否为闰年
		// if (year % 400 == 0 ){
		// 	System.out.printf("%d 是闰年%n", year);
		// }
		// else if ((year % 4 == 0) && (year % 100 != 0)){
		// 		System.out.printf("%d 是闰年%n", year);
		// 	}
		// else {
		// 		System.out.printf("%d 不是闰年%n", year);
		// 	}
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
				System.out.printf("%d 是闰年%n", year);
			}
		else {
				System.out.printf("%d 不是闰年%n", year);
			}
	}
}