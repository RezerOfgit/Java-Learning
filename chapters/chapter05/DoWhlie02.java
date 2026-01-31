// 1）打印1—100
// 2）计算1一100的和
// 3）统计1—200之间能被5整除但不能被3整除的个数

public class DoWhlie02{
	public static void main(String [] args){
		int start = 1, end = 100;
		int i = start , sum = 0;
		//dowhile 实现
		do {
			System.out.println(i);
			sum += i;
			i++;
		} while (i <= end);
		System.out.println("1一100的和为" + sum);
		
	}
}