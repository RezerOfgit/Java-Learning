// SwitchExercise.java
// 使用 switch 把小写类型的 char型转为大写（键盘输入）。
// 只转换a，b，c，d，e.其它的输出“other”。

import java.util.Scanner;
public class SwitchExercise01{
	public static void main (String [] args){
		//1.创建描述对象
		Scanner charScanner = new Scanner (System.in);

		//2.获得用户输入信息
		System.out.println("请输入字符(a-e)：");
		char c1 = charScanner.next().charAt(0);

		//3.业务核心逻辑，Switch
		switch (c1){
			case 'a':
			System.out.println("A");
			break;

			case 'b':
			System.out.println("B");
			break;

			case 'c':
			System.out.println("C");
			break;

			case 'd':
			System.out.println("D");
			break;

			case 'e':
			System.out.println("E");
			break;

			default:
			System.out.println("other");
        // 如果上面都不匹配，就执行这里 (相当于 else)
        	break;
		}
	}
}
