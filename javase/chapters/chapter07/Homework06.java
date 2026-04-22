// 6.编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，
// 定义四个方法实现求和、差、乘、商（要求除数为0的话，要提示）
// 并创建两个对象，分别测试
 
public class Homework06{
    public static void main(String[] args){
    	Cale cale1 = new Cale(5, 2);
    	Cale cale2 = new Cale(1, 0);
    	cale1.showInfo();		
    	cale2.showInfo();		
    }
}
class Cale{
	double num1, num2;

	//构造器
	public Cale(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}

	//求和
	public double getSum(){
		return num1 + num2;
	}

	//求差
	public double getSubtract(){
		return num1 - num2;
	}

	//求积
	public double getProduct(){
		return num1 * num2;
	}
	
	//求商
	public Double getQuotient(){
		if(num2 == 0){
			return null;
		}
		return num1 / num2;
	}

	//打印信息
	public void showInfo(){
		Double div = getQuotient();
        // 三元运算符：如果是 null，就显示 "错误"，否则显示结果
        String divStr = (div == null) ? "除数不能为0" : div.toString();

		System.out.println(num1 + "与" + num2 + "和 = " + getSum() + 
			"，差 = " + getSubtract() + "，积 = " + getProduct() + 
			"，商 = " + divStr);
	}
}