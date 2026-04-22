// 背景： 我们需要计算 1+2+3... 的和。但是系统有个限制：总和不能超过 20。
// 一旦超过，就要立刻停止。
// 需求：
// 循环从 1 加到 100。
// 每次累加后，检查当前的和 sum。
// 如果 sum 大于 20，打印一句话：“当前和是 xxx，超过 20 了，停止！”，然后结束循环。
// 如果在 20 以内，打印当前加到了几。
// 提示： 这是典型的“中途下车”逻辑，该用哪个关键字？
public class For06{
	public static void main (String [] args){
		int start = 0, end = 100, sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
			if (sum > 20) break;
			}
			System.out.println("当前和是:"+ sum + "，超过 20 了，停止！" );
		}
			
}