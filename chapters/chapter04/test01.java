public class test01{
	public static void main (String [] args){
		// int a = 10;
		// int b = 5;
		// int c = 2;

		// // 请计算 result1 的值
		// int result1 = a + b * c; 

		// // 请计算 result2 的值
		// int result2 = (a + b) * c; 

		// // 请计算 result3 的值
		// int result3 = a + b / c;
		// System.out.println("" + result1 + result2 + result3);
		// int num,a,b,x,y,z;
		// num = 753;
		// a = num % 100;
		// x = (num - a) / 100;
		// b = (num - 100*x) % 10;
		// y = ((num - 100*x) - b) / 10;
		// z = num - 100*x - 10*y;
		// System.out.println(x + "\n" + y + "\n" + z);
		// int num = 753;
		// int bai = num / 100;        // 753 -> 7
		// int shi = num / 10 % 10;    // 753 -> 75 -> 5
		// int ge  = num % 10;         // 753 -> 3

		// System.out.println(bai + "\n" + shi + "\n" + ge);
		int num = 9527;
		int bai = (num / 10 % 100) / 10;//9527-->952-->52-->5
		System.out.println(bai);

	}
}