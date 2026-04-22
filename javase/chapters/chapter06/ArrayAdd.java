// 要求：实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java1）
// 原始数组使用静态分配int[]arr={1.2,3}
// 2）增加的元素4，直接放在数组的最后arr={1，2,3，4}
// 
public class ArrayAdd{
	public static void main(String[] args){
		int[] arr = {1, 2, 3};
		int[] arr2 = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++){
			arr2[i] = arr[i];
		}
		arr2[arr2.length - 1] = 4;
		arr = arr2;
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i] + "\t");
		}
	}
}