// 3.判断一个年份是否为润年

//1.能被4整除不能被100整除
//2.能被400整除
//
import java.util.Scanner;
public class Homework03{
	public static void main(String [] args){
		//1.创建描述对象
		Scanner yearScanner = new Scanner (System.in);

		//2.获取用户输入
		System.out.println("请输入年份：");
		int year = yearScanner.nextInt();

		//3.业务核心逻辑，判断是否为闰年
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
			System.out.println(year + "年是闰年");
		}else {
			System.out.println(year + "年不是闰年");
		}

	}
}