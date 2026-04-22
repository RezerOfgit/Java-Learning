import java.util.Scanner;//表示把java.util下的Scanner类导入
public class Review02{
	//编写一个main方法
	public static void main(String [] args){
		// //演示接受用户的输入
		// //步骤
		// //Scanner 类 表示 简单文本扫描器，在java.util 包
		// //1.引入/导入 Scanner 对象,new 创建一个对象，体会
		// //myScanner 就是Scanner 类的对象
		Scanner myScanner = new Scanner (System.in);
		// //3.接收用户输入了，使用 相关的方法
		System.out.println("请输入性别：");
		// //当程序执行到next 方法时，会等待用户输入~~
		// char gender = myScanner.nextChar('');//接收用户输入字符
		// System.out.println("性别：" + gender);
        
        //  错误写法：
        // char gender = myScanner.nextChar(''); 
        
        //  正确写法：
        // 1. myScanner.next()  -> 先拿到字符串 "男"
        // 2. .charAt(0)        -> 再拿 "男" 字里的第1个字
        char gender = myScanner.next().charAt(0);
        
        System.out.println("性别：" + gender);
	}
}