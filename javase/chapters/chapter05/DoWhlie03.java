//统计1―200之间能被5整除但不能被3整除的个数

public class DoWhlie03{
	public static void main(String [] args){
		int start = 1, end = 200;
		int i = start,j = 0;
		//dowhile 实现
		do {
			if (i % 5 == 0 && i % 3 !=0){
				j++;
				System.out.println(i);
			}
			i++;
		} while (i <= end);
		System.out.println("1―200之间能被5整除但不能被3整除的个数为" + j);	
	}
}