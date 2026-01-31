// 2.请求出一个数组int1的最大值{4，-1，9，10，23}，并得到对应的下标。·
// ArrayExercise02.java
// 
public class ArrayExercise02{
	public static void main(String [] args){
		int[] nums = {4, -1, 9, 10, 23};
		int max = nums[0];
		int maxIndex = 0;
		for (int i = 1; i < nums.length; i++){
			if(max < nums[i]){
				max = nums[i];
				maxIndex = i;
			}
		}
		System.out.println("最大值=" + max);
		System.out.println("最大值下标=" + maxIndex);
	}
}