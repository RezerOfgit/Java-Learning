//打印一个 3行 5列 的星星矩阵。
public class NestedLoops{
	public static void main(String [] args){
		int i, j, k;
		for (i = 1; i <= 5; i++){
			for (k = 1; k <= 5 - i; k++){
				System.out.print(' ');
				}
			for (j = 1; j <= 2*i - 1; j++){
				if ((j == 1 || j == 2*i - 1) || (i == 5)){
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		
	}
}