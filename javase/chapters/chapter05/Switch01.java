//Switch01.java
//char gender = genderScanner.next().charAt(0);
import java.util.Scanner;
public class Switch01{
	public static void main (String [] args){
		 
		//1.创建描述对象
		Scanner chScanner = new Scanner (System.in);

		//2.获得用户输入
		System.out.println("请输入字符(a-g)：");
		char cha = chScanner.next().charAt(0);

		//3.业务核心逻辑，switch
		switch (cha){
			case 'a' :
			System.out.println("星期一");
			//break;

			case 'b' :
			System.out.println("星期二");
			break;

			case 'c' :
			System.out.println("星期三");
			break;

			case 'd' :
			System.out.println("星期四");
			break;

			case 'e' :
			System.out.println("星期五");
			break;

			case 'f' :
			System.out.println("星期六");
			break;

			case 'g' :
			System.out.println("星期日");
			break;

			default:
			System.out.println("你输入的什么鬼？");
        // 如果上面都不匹配，就执行这里 (相当于 else)
        	break;
		}

	}
}
