// 背景： 这是大家聚餐时常玩的游戏。大家轮流报数，遇到与 7 相关的数字就要拍手（跳过不读）。
// 需求： 使用 for 循环，打印 1 到 100 之间所有的整数。 
// 但是：如果这个数字是 7 的倍数（比如 7, 14, 21...），就不要打印它，直接跳过。
// 提示：循环 1-100 判断：if (i % 7 == 0) ..用 continue 还是 break？

public class For05{
	public static void main (String [] args){
		int start = 0, end = 100;
		for (int i = start; i <= end; i++) {
			if (i % 7 == 0) continue;
			System.out.println( i );
			}
		}
			
}