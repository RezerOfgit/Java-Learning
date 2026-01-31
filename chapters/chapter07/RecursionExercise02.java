// 2.猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
// 以后每天猴子都吃其中的一半，然后再多吃一个。
// 当到第10天时，想再吃时（即还没吃）发现只有1个桃子了。问题：最初共多少个桃子？


public class RecursionExercise02{
	public static void main(String[] args){
		peachNum n = new peachNum();
		int days = 1;
		int res = n.pNum(days);
		System.out.println("第" + days + "天桃子的数量 = " + res);
		//System.out.println("最初桃子的数量 = " + res2);
	}
}
class peachNum{
	//思路
	//1.方法的返回类型 int
	//2.方法的名字 days
	//3.方法的形参 (int n)
	//方法体
	//
	public int pNum(int day) {
	    if (day == 10) {
	        // 1. 出口：如果是第10天，直接返回 1
	        return 1; 
	    } else if (day >= 1 && day <= 9){
	    	return (pNum(day + 1) + 1) * 2;
	    }else {
	    	System.out.println("天数输入错误");
	        return -1;
	    }
	}
}