public class ArithmeticOperator{
	public static void main(String [] args){
		// // /的使用
		System.out.println(10 / 4);
		System.out.println(10.0 / 4);
		double d = 10 / 4;
		System.out.println(d);
		// %取模，取余数
		// %的本质 公式：a % b = a - (int)a / b * b
		// -10 % 3 => -10 -(-10) / 3 * 3 = -10 + 9 = 1
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-1
		System.out.println(10 % -3);//1
		System.out.println(-10 % -3);//1

		//++的作用
		int i = 10;
		i++;
		++i;
		System.out.println("i=" + i);//12
		/**
		 * 作为表达式使用
		 * 前++：++i先自增后赋值
		 * 后++:i++先赋值后自增
		 */
		int j = 8;
		//int k = ++j;//j=j+1,k=j
		int k = j++;//k=j=8,j=j+1
		System.out.println("k=" + k + "j=" + j);
	}
}