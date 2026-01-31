// Arraycopy

public class ArrayCopy{
	public static void main(String[] args){
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[arr1.length];

		for(int i = 0; i < arr1.length; i++){
			arr2[i] = arr1[i];
		}

		arr2[0] = 100;

		for(int i = 0; i < arr1.length; i++){
			System.out.println("arr1对应的元素为" + arr1[i]);
		}
		for(int i = 0; i < arr2.length; i++){
			System.out.println("arr2对应的元素为" + arr2[i]);
		}


	}
}
