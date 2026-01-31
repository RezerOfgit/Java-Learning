import java.util.Scanner;
public class DoWhlie01{
	public static void main(String [] args){
		// 1.这是一个dowhile打印还钱的循环
		String ans;
		do {
			System.out.println("还钱吗？");
		
		//2.创建描述对象
		Scanner myScanner = new Scanner (System.in);
		ans = myScanner.next();

		//3.业务核心逻辑，do-while循环
		}
		while (!ans.equals("yes"));
// 	 // import java.util.Scanner;

// public class DoWhile01 {
//     public static void main(String[] args) {
//         // 1. 优化：Scanner 提到外面，只造一次
//         Scanner myScanner = new Scanner(System.in);
//         String ans;
        
//         do {
//             System.out.println("还钱吗？(输入 yes 还是 no)");
//             ans = myScanner.next();
//         } while (!ans.equals("yes")); // 只要不是 yes，就死循环
        
//         System.out.println("算你识相，放过你了！");
    }
}
	}
}