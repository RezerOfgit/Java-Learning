// 背景： 这是 P124 视频里提到的编程思想，也是真实软件开发中最常见的功能。
//  我们给用户 3 次机会 输入用户名和密码。
// 需求：
// 定义正确的用户名为 "admin"，密码为 "123"。
// 使用 for 循环，允许用户尝试 3 次。
// 循环内逻辑：
// 提示输入用户名和密码。
// 判断：(利用 String 的 equals 方法)
// 如果输入正确：打印“登录成功！”，并立即结束循环（后面不需要再试了）。
// 如果输入错误：提示“登录失败，你还有 x 次机会”。
// 循环结束后：如果 3 次都试完了还没成功，这部分逻辑你想想怎么处理？
// （这里有点难，可以先只做循环内的部分）。
// 字符串比较小贴士：不要用 name == "admin",要用 “admin”.equals(name)
import java.util.Scanner;
public class For07{
	public static void main (String [] args){
		//1.业务核心逻辑，for
		int start = 1, end = 3;
		for (int i = start; i <= end; i++){
			if (i >= 1 && i <= 3){

				//2.创建扫描对象
				Scanner nameScanner = new Scanner (System.in);

				//3.获取用户输入
				System.out.println("请输入用户名：" );
				String name = nameScanner.next();
				System.out.println("请输入密码：" );
				int password = nameScanner.nextInt();

				//4.先进行合法性验证
				if ("admin".equals(name) && password == 123){
					System.out.println("登录成功！");
					break;
				}else {
					System.out.println("登录失败，你还有" + (end - i) + "次机会！");
				}
			}else {
				System.out.println("登录次数用尽，请明天再来尝试！");
			}
		
		}
		
		}
			
}