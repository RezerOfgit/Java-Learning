// 2.请对一个有序数组进行二分查找{1，8，10，89，1000，1234}，
// 输入一个数看看该数组是否存在此数，并且求出下标，如果没有就提示“没有这个数”。
// 
// 
import java.util.Scanner;
import java.util.Arrays;
public class SeqSearch02{
	public static void main(String[] args){
		//创建一个字符串数组
		int[] arr = {1, 8, 10, 89, 1000, 1234,52 , 300, -5};

		System.out.println("===原数组为===");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}

		// --- 1. 深拷贝 (保护原数组) ---
        int[] sortedArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }

		// --- 2. 排序 (二分查找的前提是数组有序) ---
		int temp = 0;
		for(int i = 0; i < sortedArr.length - 1; i++){
			for(int j = 0; j < sortedArr.length - 1 - i; j++){
				if(sortedArr[j] > sortedArr[j + 1]){
					temp = sortedArr[j];
					sortedArr[j] = sortedArr[j + 1];
					sortedArr[j + 1] = temp;
				}
			}
			if(temp == 0){
				break;
			}
		}
		System.out.println("\n===由小到大排序结果===");
		for(int i = 0; i < sortedArr.length; i++){
			System.out.print(sortedArr[i] + "\t");
		}

		//创建描述对象
		Scanner myScanner = new Scanner(System.in);
		System.out.println("\n请输入数字：");
		int findNum = myScanner.nextInt();

		// --- 3. 二分查找核心 (使用左右指针) --- 
		int left = 0;
        int right = sortedArr.length - 1;
        int index = -1; // 用于记录找到后的下标

        while (left <= right) { // 只要左边还没跑到右边去，就继续找
            // 计算中间位置
            int mid = (left + right) / 2;

            if (findNum == sortedArr[mid]) {
                System.out.println("在排序后的数组中找到了！值: " + findNum);
                index = mid; 
                break; // 找到了就退出
            } else if (findNum < sortedArr[mid]) {
                // 目标比中间小，说明在左边。
                // 把右边界移过来，缩小范围
                right = mid - 1;
            } else { // findNum > sortedArr[mid]
                // 目标比中间大，说明在右边。
                // 把左边界移过去
                left = mid + 1;
            }
        }


        // --- 4. 如果找到了，去原数组找原始下标 ---
        if (index != -1) {
            System.out.println("正在原数组中查找原始下标...");
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] == findNum) {
                    System.out.println("找到！原数组下标为: " + k);
                    // 注意：原数组里可能有重复的，这里只打印了第一个遇到的
                }
            }
        } else {
            System.out.println("遗憾，没有找到该数字。");
        }
        
        // 记得关闭
        myScanner.close(); 
    }
}
// 		int[] arr2 = new int[arrcopy.length / 2];
// 		int index = -1;
// 		for(int i = 0; i < arrcopy.length; i++){
// 			if(findNum < arrcopy[i / 2]){
// 			//0 <--> i / 2  之间继续判断
// 			arr2[i] = arrcopy[i];
// 			index = i;
// 		}
// 			if(findNum == arrcopy[i / 2]){
// 				System.out.println("恭喜你找到" + findNum);
// 				for(int k = 0; k < arr.length; k++){
// 					if(findNum == arr[k]){
// 						System.out.println("下标为" + k);
// 					}
// 				}
// 				index = i;
// 				break;
// 			}
// 			if(findNum > arrcopy[i / 2]){
// 			//i / 2 <--> i 之间继续判断
// 			arr2[i] = arrcopy[arrcopy.length / 2 - 1 + i];
// 			index = i;
// 			}
// 			arrcopy = arr2;
// 		}
// 		if(index == -1){
// 			System.out.println("未找到" + findNum);
// 		}
// 	}
// }