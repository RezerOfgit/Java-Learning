// 4.判断一个整数是否是水仙花数，
// 所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
// 例如：153=1*1*1+3*3*3+5*5*5
// 

import java.util.Scanner;
public class Homework04{
	public static void main(String [] args){
		//1.创建描述对象
		Scanner numScanner = new Scanner(System.in);

		//2.获取用户输入
		System.out.println("请输入一个整数：");
		if (numScanner.hasNextInt()) {
			int num = numScanner.nextInt();

			//3.业务核心逻辑，判断是否为水仙花数
			//3.1判断是否为3位数
			//3.2获取各个位数
			//3.3判断是否成立
			if(num <= 999 && num >= 100){
				int a,b,c;//分别表示百十个位数
				a = num / 100;
				b = num % 100 / 10;
				c = num % 10;
				// boolean isTrue = num
				if (num == a * a * a + b * b * b + c * c * c){
					System.out.println(num + "是水仙花数");
				}else {
					System.out.println(num + "不是水仙花数");
				}
			}else {
				System.out.println("输入数字不符合要求，请重新输入");
			}
	}else {
            // 3. 如果输入的不是整数（比如 143.1 或 "abc"）
            System.out.println("输入错误！请不要输入小数或文字，只能输整数！");
        }
	// 在 main 方法最后加一句
	numScanner.close();
}
}