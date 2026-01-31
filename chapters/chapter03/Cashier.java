public class Cashier{
	//编写一个简易收银条程序
	public static void main (String [] args){
		double price = 19.9;
		int quantity = 3;
		double totalprice = price * quantity;
		double discount = 0.75;
		int payment = 50;
		double change = (double) payment - totalprice * discount;
		//System.out.println("需要找的钱是：" + change + "元");
		System.out.printf("需要找的钱是：%.2f 元", change);
	}
}