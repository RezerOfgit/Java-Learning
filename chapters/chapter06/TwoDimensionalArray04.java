

public class TwoDimensionalArray04{
	public static void main(String[] args){
		int arr[][] ={{4, 6}, {1, 4, 5, 7}, {-2}, {10, 20, -15 ,5}};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++){
			// arr[i] = new int[i + 1];
			for(int j = 0; j < arr[i].length; j++){
				// arr[i][j] = i + 1;
				// 
				sum += arr[i][j];
			}
		}
		System.out.println("sum = " + sum);
		// for(int i = 0; i < arr.length; i++){
		// 	for(int j = 0; j < arr[i].length; j++){
		// 		System.out.print(arr[i][j] + " ");
		// 	}
		// 	System.out.println();
	}
}