// 4.已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如：
// [10，12，45，90],添加23后，数组为[10，12，23，45，90]

import java.util.Scanner;
public class HomeWork04{
	public static void main(String[] args){
		int[] arr = {10, 12, 45, 90};

		//1.创建描述对象
		Scanner myScanner = new Scanner(System.in);
		
		do{
			//2.先输出当前数组
			System.out.println("当前数组为：");
			for(int i : arr) System.out.print(i + "\t");

			//3.输入的元素
			System.out.println("\n请输入新的数字：");
			int num = myScanner.nextInt();

			//4.1.创建新数组
			int[] arr2 = new int[arr.length + 1];

			//4.2.寻找插入位置 (Index)
            // 默认插在最后
            int index = arr2.length - 1;
			for(int i = 0; i < arr.length; i++){
				if(num < arr[i]){//如果num最大，则默认是最后
					index = i;
					break;
				}
			}
			//4.3.核心搬运逻辑 (复制 + 错位)
            // 分三段处理：
            // A. index 之前的数据：照搬
            // B. index 位置：放入新数据
            // C. index 之后的数据：全部后移一位
            for(int i = 0, j = 0; i < arr2.length; i++){
            	if(i == index){
            		arr2[i] = num;
            	}else{
            		arr2[i] = arr[j];
            		j++;
            	}
            }

            arr = arr2;
			System.out.println("新数组为：");
			for(int i : arr) System.out.print(i + "\t");
			System.out.println();

			System.out.println("是否继续添加？(y/n)");
            char key = myScanner.next().charAt(0);
            if (key == 'n') {
                break;
            }
		}while(true);
		System.out.println("结束输入");
		myScanner.close(); // 关闭 Scanner
	}
}