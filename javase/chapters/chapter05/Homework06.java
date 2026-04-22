// 7.输出小写的a-z以及大写的z-A

// 
public class Homework06{
	public static void main(String [] args){
		//'b' = a + 1, 'c' = a + 2
		//for循环
		for (char c1 = 'a'; c1 <= 'z'; c1++){
			
			System.out.print(c1 + " ");
		}
		//System.out.println();
		System.out.println("\n============");
		for (char c1 = 'Z'; c1 >= 'A'; c1--){
			
			System.out.print(c1 + " ");
		}
	}
}