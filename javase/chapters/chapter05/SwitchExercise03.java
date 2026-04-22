// 根据用于指定月份，打印该月份所属的季节。
// 3，4，5春季6，7，8夏季9，10，11秋季
// 12，1，2冬季【课堂练习，提示使用穿透】
// 
import java.util.Scanner;
public class SwitchExercise03{
	public static void main (String [] args){
		//1.创建描述对象
		Scanner monthScanner = new Scanner (System.in);

		//2.获得用户输入信息
		System.out.println("请输入月份(0-12)：");
		int mon = monthScanner.nextInt();

		//3.业务核心逻辑，Switch
		switch (mon){
			case 3:
			//System.out.println("春季");
			//break;

			case 4:
			//System.out.println("春季");
			//break;
			
			case 5:
			System.out.println("春季");
			break;
			
			case 6:
			//System.out.println("夏季");
			break;

			case 7:
			//System.out.println("夏季");
			//break;
			
			case 8:
			System.out.println("夏季");
			break;
			
			case 9:
			//System.out.println("秋季");
			//break;

			case 10:
			//System.out.println("秋季");
			//break;
			
			case 11:
			System.out.println("秋季");
			break;

			case 12:
			//System.out.println("冬季");
			//break;

			case 1:
			//System.out.println("冬季");
			//break;
			
			case 2:
			System.out.println("冬季");
			break;
			
			default:
			System.out.println("输入错误");
        // 如果上面都不匹配，就执行这里 (相当于 else)
        	break;
		}
	}
}