// 打印出九九乘法表[课后题]
// 
// 
public class MulFor02{
	public static void main(String [] args){
		int i, j;
		for (j = 1; j <= 9; j++){
			for (i = 1; i <= j; i++){
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println();	
		}
		
	}
}