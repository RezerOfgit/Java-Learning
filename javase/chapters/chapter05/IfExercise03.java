//定义两个变量int，判断二者的和，是否能被3又能被5整除打印提示信息
public class IfExercise03{
	//编写一个main方法
	public static void main(String [] args){
		int a = 100;
		int b = 20;
		if ((a + b) % 3 == 0 & (a + b) % 5 == 0){
			System.out.println("两数之和为：" + (a + b) + 
				"\n两数之和能被3又能被5整除");
		} 
		else 
		System.out.println(a + b);
	}
}