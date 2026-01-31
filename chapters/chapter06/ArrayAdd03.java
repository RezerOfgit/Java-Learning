// 需求： 请编写类 ArrayAdd：
// 初始定义一个 int[] arr = {10, 20}; (只有 2 个空间)。
// 循环逻辑：
// 询问用户：“我们要去探险吗？(y/n)”
// 如果输入 y：
// 提示输入一个新数字（战利品）。
// 执行扩容逻辑：数组长度 +1，把新数字加到最后。
// 打印当前数组所有的宝物。
// // 核心难点：这需要结合 Scanner、do-while 循环和 数组扩容 三大知识点。
// (提示：关键在于 newArr[newArr.length - 1] = 新数字 )
// 
import java.util.Scanner;
public class ArrayAdd03{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {10, 20};
		System.out.println("我们要去探险吗？ y/n");
		char key1 = myScanner.next().charAt(0);
		if(key1 == 'n'){
				return;
			}

		do {
			System.out.println("输入一个新数字：");
			int addNum = myScanner.nextInt();

			int[] arr2 = new int[arr.length + 1];
			for(int i = 0; i < arr.length; i++){
				arr2[i] = arr[i];
			}

			arr2[arr2.length - 1] = addNum;
			arr = arr2;

			System.out.println("====当前数组所有宝物====");
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + "\t");
			}

			System.out.println("\n是否继续添加 y/n");
			char key2 = myScanner.next().charAt(0);
			if(key2 == 'n'){
				break;
			}
		}while(true);
		System.out.println("结束了冒险");
		myScanner.close(); // 关闭 Scanner
	}
}