// 1）编写类MyTools类，编写一个方法可以打印二维数组的数据。

public class MethodExercise03{
	public static void main(String[] args){
		int[][] arr = {{1, 2, 3}, {10, 4, 4, 7}, {2, 3, 9}};
		MyTools tool = new MyTools();
		
		tool.print(arr);
		//System.out.println("main方法中：\na=" + a + "\tb=" + b);
	}
}

class MyTools{
	//思路
	//1.方法的返回类型 void
	//2.方法的名字 print
	//3.方法的形参 (int[][] arr)
	//方法体

	public void print(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		return;
	}

}