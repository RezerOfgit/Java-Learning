
// 1）1-100以内的数求和，求出当和第一次大于20的当前数【for+break】

public class Break02{
	public static void main(String [] args){
		int start = 1, end = 100;
		int sum = 0;
		for (int i = start; i <= end; i++){
			sum += i;
			if(sum > 20){
				System.out.println("当前数" + i);
				break;
			}
		}
		
	}
}
