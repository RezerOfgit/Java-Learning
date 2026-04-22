// 课后练习题：ArrayReduce.java
// 有一个数组{1，2，3，4，5}，可以将该数组进行缩减，
// 提示用户是否继续缩减，每次缩减最后哪个元素。
// 当只剩下最后一个元素，提示，不能再缩减。
// 
// 
import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5};

		//创建描述对象
		Scanner myScanner = new Scanner(System.in);

		do {
			System.out.println("是否缩减数组 y/n");
			char key = myScanner.next().charAt(0);

			if(key == 'n'){
				break;
			}
			if(arr.length == 1){
				System.out.println("只剩下最后一个元素，不可缩减");
				break;
			}
			int[] arr2 = new int[arr.length - 1];
			for(int i = 0; i < arr.length - 1; i++){
				arr2[i] = arr[i];
				
				}
			arr = arr2;
			for(int i = 0; i < arr.length; i++){
				System.out.println(arr[i] + "\t");
			}

			
		}while(true);
	}
}