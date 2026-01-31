public class Review{
	public static void main(String [] args){
		int i = 1;
		i = i++; 
		System.out.println(i); // 结果是 1 

		int x = 5;
		int y = 5;
		// 问：if 执行完后，x 和 y 分别是多少？
		// x++ == 6->x=5,false,x++=6,
		// 
		// 
		if (x++ == 6 && ++y == 6) {
		    x = 100;
		}
		System.out.println(x); //6
		System.out.println(y); //5

		// 问：obj 打印出来是整数 10 还是小数 10.0？
		Object obj = true ? new Integer(10) : new Double(20.0);
		System.out.println(obj);//10.0
		//2 << 3
		System.out.println(2 << 3);//16
		//~ -1 = ?
		//1 的原码：0000 0001
		//-1的原码：1000 0001
		//-1的反码：1111 1110
		//-1的补码：1111 1111
		//~-1的补码：0000 0000->0
		System.out.println(~-1);// 0
	}
}
