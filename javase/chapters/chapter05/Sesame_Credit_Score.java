import java.util.Scanner;
public class Sesame_Credit_Score{
	public static void main(String [] args){
		//1.创建扫描对象
		Scanner SesScanner = new Scanner (System.in);

		//2.获取用户输入
		System.out.println("请输入芝麻信用分（1-100）：");
		int score = SesScanner.nextInt();

		//3.核心业务逻辑，根据信用分进行分级
		//4. 先进行合法性验证 (Validating)
        if (score >= 1 && score <= 100) {
        	if (score == 100){
			System.out.println("信用极好");
			}else if (score > 80 && score <= 99){
				System.out.println("信用优秀");
			}else if (score >= 60 && score <= 80){
				System.out.println("信用一般");
			}else {
				System.out.println("信用不及格");
			}
		} else {
			System.out.println("输入错误，信用分需要在 1-100 之间");
		}
	}
}