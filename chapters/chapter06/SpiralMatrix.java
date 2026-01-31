// 挑战背景：蜗牛散步我们需要创建一个 n * n 的正方形矩阵，
// 然后让一只蜗牛从左上角出发，顺时针螺旋向内爬行，每爬一步留下一个数字。
// 目标效果 (当 n = 4 时)：我们需要填入 1 到 16 (4 * 4) 的数字。
// 
//  1   2   3   4   <-- 向右
// 12  13  14   5   <-- 向下
// 11  16  15   6   <-- 向左
// 10   9   8   7   <-- 向上

public class SpiralMatrix{
	public static void main(String[] args){
		/*
		需求： 请编写类 SpiralArray：
		定义一个变量 int n = 4; (表示 4行4列)。
		创建一个 n * n 的二维数组。
		核心逻辑：使用循环，按照 右 -> 下 -> 左 -> 上 的顺序填入数字 1 到 n*n。
		打印最终矩阵。
		 */
		/*
		top (上边界，初始为 0)
		bottom (下边界，初始为 n-1)
		left (左边界，初始为 0)
		right (右边界，初始为 n-1)
		 */
		int n = 4;
		int value = 1;
		int[][] arr = new int[n][n];

		int top = 0, bottom = n - 1, left = 0, right = n - 1;

		while(value <= n * n){
			// 从左到右填充上边界
			if(top <= bottom){
				for(int i = left; i <= right; i++){
					arr[top][i] = value++;
				}
				top++;
			}

			// 从上到下填充右边界
			if(left <= right){
				for(int i = top; i <= bottom; i++){
					arr[i][right] = value++;
				}
				right--;
			}

			// 从右到左填充下边界
			if(top <= bottom){
				for(int i = right; i >= left; i--){
					arr[bottom][i] = value++;
				}
				bottom--;
			}

			// 从下到上填充左边界
			if(left <= right){
				for(int i = bottom; i >= top; i--){
					arr[i][left] = value++;
				}
				left++;
			}
		}

		System.out.println("生成的数组为：");
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		} 
	}
}