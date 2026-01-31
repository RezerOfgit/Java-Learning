// 3.编写类Book，定义方法updatePrice，实现更改某本书的价格，
// 具体：如果价格>150，则更改为150，如果价格>100，
// 更改为100，否则不变Homework03.java
public class Homework03{
    public static void main(String[] args){
    	//double price = 125;
    	Book book = new Book("笑傲江湖", 300);
    	book.info();
    	book.updatePrice();
    	book.info();
    	// double newprice = b.updatePrice(price);
    	// System.out.println("书的价格是：" + newprice + "元");

    }
}
class Book{
	String name;
	double price;
	public Book(String name, double price){
		this.name = name;
		this.price = price;
	}
	public void updatePrice(){
		if(this.price > 150){
			price = 150;
		}else if(this.price > 100){
			price = 100;
		}
	}
	//显示书籍情况
	public void info(){
		System.out.println("书名=" + this.name + " 价格=" + this.price);
	}
}