// 挑战任务： 请编写类 ArrayReverse，
// 任选一种方案（如果想挑战自己，强烈推荐方案 B！）
// 实现数组反转并打印结果。
// int[] arr = {11, 22, 33, 44, 55, 66};

public class ArrayReverse01{
	public static void main(String[] args){
		int[] arr1 = {11, 22, 33, 44, 55, 66};
		int[] arr2 = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++){
			arr2[i] = arr1[arr1.length - i -1];
			System.out.println("arr2对应的元素为" + arr2[i]);
		}
	}
}