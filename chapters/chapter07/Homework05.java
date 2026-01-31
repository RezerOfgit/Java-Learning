// 5.定义一个圆类Circle，定义属性：半径radius，提供显示圆周长功能的方法，
// 提供显示圆面积的方法
public class Homework05{
    public static void main(String[] args){
    	Circle circle = new Circle(1);
    	circle.showInfo();		
    }
}
class Circle{
	double radius;//半径

	//构造器
	public Circle(double radius){
		this.radius = radius;
	}

	//计算周长，只负责计算并返回，不修改任何属性
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}

	//计算面积，只负责计算并返回
	public double getArea(){
		return Math.PI * radius * radius;
	}

	//打印信息
	public void showInfo(){
		System.out.printf("半径为 %.2f 的圆的周长 = %.2f，面积 = %.2f%n", 
			radius, getPerimeter(), getArea());
	}
	
}