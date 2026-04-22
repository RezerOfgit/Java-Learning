// 2）实现登录验证，有3次机会，如果用户名为“丁真”，密码“666“提示登录成功，
// 否则提示还有几次机会，请使用for+break完成

import java.util.Scanner;
public class Break03{
	public static void main(String [] args){
		//这个 “定义布尔变量 -> 循环中修改 -> 循环后判断” 的模式，
//     是编程里处理“多伦尝试”问题的标准答案。
		//1.创建扫描对象
		Scanner myScanner = new Scanner (System.in);

		//2.定义布尔变量
		boolean isSuccess = false;

		//3.业务核心逻辑，循环中修改
		//3.1 循环3次
		for (int i = 1; i <= 3; i++){
			//3.2 获取用户输入
			System.out.println("请输入用户名：" );
			String user_name = myScanner.next();
			System.out.println("请输入密码：" );
			String passWord = myScanner.next();//防止0开头数字识别不到

		//4.进行判断
			if("丁真".equals(user_name) && "666".equals(passWord)){
				System.out.println("登陆成功！" );
				//boolean 开关打开，结束操作
			isSuccess = true;
			break;
			}else {
				int count = 3 - i;
				if (count > 0){
					System.out.println("登录失败，你还有" + count + "次机会！");
				}
			}
		}
		//5.循环后判断
		if (isSuccess == false){
			System.out.println("登录次数用尽，请明天再来尝试！");
		}
		
	}
}
