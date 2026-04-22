// 任务回顾 (TwoDimensionalArray01)：
// 定义 int[][] map (3行4列)。
// 手动填入数据（0是空，1是有人）。
// 双层循环打印出座位表（就像电影院选座界面那样）。
// 统计有多少个 0 (空位) 并打印。
// // 参考数据
// 0 0 0 1
// 1 0 1 0
// 1 1 0 0



import java.util.Scanner;
public class TwoDimensionalArray05{
	public static void main(String[] args){
		int arr[][] =new int[3][4];
		//创建描述对象
		Scanner myScanner = new Scanner(System.in);
		int num = 0;
		int count = 0;
		

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.println("请输入第" + (i + 1) + "行，第" + 
					(j + 1) + "列是否有人");//数字0是空，1是有人
				num = myScanner.nextInt(); 
				
				//检查输入是否正确
				while (num != 0 && num != 1) {
	            System.out.println("输入错误，请重新输入（0 或 1）：");
	            num = myScanner.nextInt(); // 重新输入
	        	}

	        	//统计输入0的个数
	        	if(num == 0){
					count++;
				}
				arr[i][j] = num;
			}
		}
		System.out.println("一共有" + count + "个空座位");
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		myScanner.close(); 
	}
}