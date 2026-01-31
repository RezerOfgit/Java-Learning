// 根据行、列、字符打印对应行数和列数的字符，
// 比如：行：4，列：4，字符#，则打印相应的效果
// 
public class MethodExercise02{
	public static void main(String[] args){
		Arr a = new Arr();
		a.print(4, 4, "苏");
	}
}

class Arr{
	//思路
	//1.方法的返回类型 void
	//2.方法的名字 print
	//3.方法的形参 (int row, int col, String c)column
	//方法体，判断 for
	
	// int line;
	// int row;
	// String character;

	public void print(int row, int col, String c){
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(c);
			}
			System.out.println();
		}
		return;
		// String[][] arr1 = 
		// // if(num % 2 != 0){
			
		// // 	System.out.println("是奇数");
		// // 	return true;
		// // }else {
			
		// 	System.out.println("是偶数");
		// 	return false;
		// }
		
	}

}