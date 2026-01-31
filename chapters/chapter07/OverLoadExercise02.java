// 2.在Methods类，定义三个重载方法max0，
// 第一个方法，返回两个int值中的最大值，
// 第二个方法，返回两个double值中的最大值，
// 第三个方法，返回三个double值中的最大值，
// 并分别调用三个方法。
public class OverLoadExercise02{
	public static void main(String[] args){
		Methods me = new Methods();

		System.out.println(me.max(2, 3));
		System.out.println(me.max(2.6, 0.5));
		System.out.println(me.max(2.1, 3.3, 2.5));
	}
}
class Methods{
	//接收一个int参数
	public int max(int n1, int n2){
		int max = (n1 > n2) ? n1 : n2;
		System.out.println("两个int值中的最大值=");
		return max;
	}
	public double max(double n1, double n2){
		double max = (n1 > n2) ? n1 : n2;
		System.out.println("两个double值中的最大值=");
		return max;
	}
	public double max(double n1, double n2, double n3){
		double temp = (n1 > n2) ? n1 : n2;
		double max = (n3 > temp) ? n3 : temp;
		System.out.println("三个double值中的最大值=");
		return max;
	}
}