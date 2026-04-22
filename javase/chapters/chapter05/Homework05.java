// 6输出1-100之间的不能被5整除的数，每5个一行Homework06.java


public class Homework05{
	public static void main(String [] args){
		// 1-100间被5整除的数,i % 5 == 0
		int start = 1, end = 100;
		int count = 0;
		for(int i = start; i <= end; i++){
			
			if (i % 5 != 0){
				System.out.print(i + "\t");
				count++;
				if (count % 5 == 0){
				System.out.println();
			}
			
			}
			
		}
	}
}