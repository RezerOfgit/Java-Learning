public class ArithmeticOperator02{
	public static void main(String [] args){
		int days = 59;
		int weeks = days / 7;
		int days2 = days % 7;
		System.out.printf("还剩%d个星期零%d天\n",weeks,days2);
		double F = 234.5;
		double C = 5.0 / 9 * F - 100;
		
		System.out.printf("234.5华氏度对应的摄氏度是：%.1f ℃\n",C);
	}
}