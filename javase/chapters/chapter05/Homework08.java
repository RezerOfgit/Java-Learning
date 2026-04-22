// 9.求1+（1+2）+（1+2+3）+（1+2+3+4）++（1+2+3+..+100）的结果
// 
public class Homework08{
	public static void main(String [] args){
		//第n项为1+...+n
		//求和
		int start = 1, end = 100;
		//int count = 0;//项数
		int sum = 0;
		for(int i = start; i <= end; i++){
			for(int j = 1; j <= i; j++){
				sum += j;
			}
			
		}
		System.out.println("这个式子的值为：" + sum);
	}
}
