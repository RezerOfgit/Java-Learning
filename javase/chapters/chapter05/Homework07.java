// 8.求出1-1/2+1/3-1/4.....1/100的和


public class Homework07{
	public static void main(String [] args){
		//1-1/2+1/3-1/4.....1/100分子为1，分母递增
		//符号与项数n有关，(-1)^(n+1)或者 分母 % 2== 0时符号为-
		double n ;
		double sum = 0;
		int start = 1, end = 100;
		for(int i = start; i <= end; i++){
			
			if (i % 2 ==0){
				n = -1.0 / i;
			}else {
				n = 1.0 / i;
			}
			sum += n;
		}
		System.out.printf("这个式子的值为%.2f：" , sum);
	}
}