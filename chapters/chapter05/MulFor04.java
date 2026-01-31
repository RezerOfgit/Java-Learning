//打印菱形
//
// 1234567
//1   *
//2  * *
//3 *   *
//4*     *
//5 *   *
//6  * *
//7   *
import java.util.Scanner;
public class MulFor04{
	public static void main(String [] args){
		//1.确定菱形的边长，4
		//
		Scanner numScanner = new Scanner (System.in);
		System.out.println("请输入菱形的边长：");
		int n = numScanner.nextInt();

		//2. 确定打印机制
		//2.1 先打印每行再换列，因此在换行操作在最外
		//int i, j, k;//i控制行，j控制列,k控制空白部分
		//2.3 把菱形分成上下两部分进行操作
		//菱形的上半部分
		for (int i = 1; i <= n; i++){

			//先打印空白和*都需要打印，在同一等级
			//先打印左侧空白
			for (int k = 1; k <= n - i ; k++){
				System.out.print(' ');
			}
			//打印中间*和空白
			for (int j = 1; j <= 2*i - 1; j++){
				//*之间打印空白，因此只需找到对应的*位置即可
				if (j == 1 || j == 2*i - 1){
					System.out.print('*');
					}else {
						System.out.print(' ');
					}
				}
				System.out.println();
			}
			//菱形的下半部分
		for (int i = n - 1; i >= 1; i--) {
            // 打印左侧空格
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 打印星号和中间空格
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) { // 首尾打印星号
                    System.out.print('*');
                } else {
                    System.out.print(' '); // 中间空格
                }
            }
				System.out.println();
			}
	}
}