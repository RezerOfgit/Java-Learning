// 挑战任务： 请编写类 ArrayReverse，
// 任选一种方案（如果想挑战自己，强烈推荐方案 B！）
// 实现数组反转并打印结果。
// int[] arr = {11, 22, 33, 44, 55, 66};

public class ArrayReverse02{
	public static void main(String[] args){
		int[] arr = {11, 22, 33, 44, 55, 66};
		int temp = 0;
		int len = arr.length;
		for(int i = 0; i < len / 2; i++){
			temp = arr[len - i -1];
			arr[len - i -1] = arr[i];
			arr[i] = temp;
		}
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i] + "\t");
		}
		
	}
}