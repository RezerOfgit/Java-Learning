// 需求： 请编写 Recursion04.java，在类 T 中编写方法 money：
// 参数：day (第几天)。
// 返回值：返回那一天早上还没花钱时的金额 (int)。
// 核心逻辑 (倒推)：
// 已知结果 (出口)：如果 day == 10，返回 1。
// 递归公式：
// 你需要推导出：昨天的钱 = (今天的钱 + 2) * 2。
// 比如第 9 天的钱 = (第 10 天的 1 块 + 2) * 2。
// 测试：在 main 方法中，计算第 1 天他原本有多少钱？

public class RecursionExercise03{
	public static void main(String[] args){
		T n = new T();
		int days = 1;
		int res = n.money(days);
		if( res != -1 ){
			System.out.println("第" + days + "天的钱 = " + res);
		}
	
	}
}
class T{
	//思路
	//1.方法的返回类型 int
	//2.方法的名字 days
	//3.方法的形参 (int n)
	//方法体
	//
	public int money(int day) {
	    if (day == 10) {
	        // 1. 出口：如果是第10天，直接返回 1
	        return 1; 
	    } else if (day >= 1 && day <= 9){
	    	return (money(day + 1) + 2) * 2;
	    }else {
	    	System.out.println("天数输入错误");
	        return -1;
	    }
	}
}