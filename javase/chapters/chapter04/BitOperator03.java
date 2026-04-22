public class BitOperator03{
	public static void main(String [] args){
		System.out.println(4 << 3);// 4*2*2*2=32
		System.out.println(15 >> 2);// 15/2/2=7/2=3
		System.out.println(-10 >> 2);
		//-10 的原码：1000 0000 0000 1010
		//-10 的反码：1111 1111 1111 0101
		//-10 的补码：1111 1111 1111 0110
		//向右边移两位：1111 1111 1111 1101
		//反码：1111 1111 1111 1100
		//原码：1000 0000 0000 0011
	}
}
