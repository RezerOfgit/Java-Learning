import java.util.Scanner;
public class IfelseOperator{
	public static void main(String [] args){
		Scanner ifScanner = new Scanner (System.in);
		System.out.println("请输入你的年龄：");
		int age = ifScanner.nextInt();
		if (age >= 18){
			System.out.println("你已经成年了，要对自己的行为负责，送入监狱！");
		}
		else {
			System.out.println("你的年龄还小，这次放过你了。");
		}
	}
}