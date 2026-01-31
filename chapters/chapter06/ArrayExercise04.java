// 我们需要一个长度为 10 的数组，里面的数据必须符合数学规律：
// $y = n^2$ (n的平方)。即：第1个放 1 ($1\times1$)，
// 第2个放 4 ($2\times2$)，第3个放 9 ($3\times3$)... 直到第10个。
// 需求：请编写类 SquareArray：动态初始化一个长度为 10 的 int 数组。
// 核心逻辑：使用 for 循环，根据下标 i 计算出对应的平方数存进去。
// 
// 
public class ArrayExercise04{
	public static void main(String[] args){
		int[] square = new int[10];
		for(int i = 0; i < square.length; i++){
			square[i] = (i + 1) * (i + 1);
			System.out.println((i + 1) + "对应的平方数=" + square[i]);
		}
		
	}
}