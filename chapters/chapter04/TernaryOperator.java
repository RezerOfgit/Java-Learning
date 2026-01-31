public class TernaryOperator{
	public static void main(String [] args){
		int a = 10;
		int b = 99;
		int result = a < b ? a++ : b--;
		System.out.println("result=" + result);//a,10
		System.out.println("a=" + a);//11
		System.out.println("b=" + b);//99
	}
}