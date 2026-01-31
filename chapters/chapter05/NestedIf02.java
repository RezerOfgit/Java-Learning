// 出票系统：根据淡旺季的月份和年龄，打印票价
// 4_10旺季：成人（18-60）：60;儿童（<18）:半价;老人（>60）:1/3
// 淡季：成人：40; 其他：20
// 
import java.util.Scanner;
public class NestedIf02{
	public static void main (String [] args){
		//1.创建描述对象
		Scanner monScanner = new Scanner (System.in);

		//2.获得用户输入
		System.out.println("请输入月份：");
		int month = monScanner.nextInt();
		//int age = monScanner.nextInt();

		//3.核心业务逻辑，判断月份归属
		//进行月份合法性校验
		if (month < 1 || month > 12){
			System.out.println("月份输入错误");
			return;
		}
			//System.out.println(month + "月是旺季");
			//判断游客年龄
		System.out.println("请输入游客年龄:");
		int age = monScanner.nextInt();

		double price = 0;

		if (month >= 4 && month <= 10){
			System.out.println(month + "月是旺季");
			if (age >= 18 && age <= 60){
				price = 60;//System.out.println("成人票价为60元");
			}else if(age < 18 && age > 0){
				price = 60 / 2.0;//System.out.println("儿童票价半价为30元");
			}else if(age > 60){
				price = 60 / 3.0;//System.out.println("老人票价为原价的1/3为20元");
			}else {
				System.out.println("年龄输入错误");
				return;
			}
		}else {
			System.out.println(month + "月是淡季");
			if (age >= 18 && age <= 60){
			price = 40;//System.out.println("成人票价为40元");
		}
			else if(age > 0){
					price = 20;//System.out.println("票价半价为20元");
				}else {
					System.out.println("年龄输入错误");
					return;
				}
			}
			System.out.println("您的票价是：" + price + "元");
		}
}