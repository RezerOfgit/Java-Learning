// 定义： 素数 (Prime Number)：
// 只能被 1 和它自己整除的数（比如 2, 3, 5, 7, 11...）。
// 注意：1 不是素数。
// 任务： 打印 1 到 100 之间所有的素数，并统计一共有多少个。


public class MulFor03{
	public static void main(String [] args){
		int start = 1, end = 100;
		for (int i = start; i <= end; i++){
			if (i <= 1){
				continue;
			}
			boolean isPrime = true;
			for (int j = 2; j <= i - 1; j++){
				if (i % j == 0){
				isPrime = false;
				break;
				}
			}
			if (isPrime){
				System.out.println(i + "是素数");
			}
			
				
		}
			
	}
}