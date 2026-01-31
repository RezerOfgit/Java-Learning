// 1.打印1~100之间所有是9的倍数的整数，统计个数 及总和.
// 2.完成下面的表达式输出

public class For03{
	public static void main (String [] args){
		int count = 0, sum = 0, start = 1, end = 100;
		for (int i = start; i <= end; i++) {
			if (i % 9 == 0){
				System.out.println(i);
				count++;
				sum += i;
			}
		}
			System.out.println(count);
			System.out.println(sum);
		    
	}
}