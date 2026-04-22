// 跳转控制语句-break
// 看下面一个需求
// 随机生成1-100的一个数，直到生成了97这个数，看看你一共用了几次？
// 提示使用（int）（Math.random0*100）+1思路分析：
// 循环，但是循环的次数不知道。->break，
// 当某个条件满足时，终止循环通过该需求可以说明其它流程控制的必要性，比如break

public class test01{
	public static void main(String [] args){
		int i = 0;
		int a;
		while (true){
			a = (int) (Math.random()* 100) + 1;//生成随机数
			i++;
			System.out.println("第" + i + "次生成: " + a);

			if (a == 97){
				System.out.println(i);
				break;
			}
		}
	}
}