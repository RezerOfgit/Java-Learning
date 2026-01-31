// 1.编程实现如下功能:某人有100，000元，每经过一次路口，需要交费，
// 规则如下：1）当现金>50000时，每次交5%,2）当现金<=50000时，每次交1000
// 编程计算该人可以经过多少次路口，要求：使用while break方式完成
// 
public class Homework01{
	public static void main(String [] args){
	double money = 100000;

	//2.定义布尔变量
	boolean isSuccess = true;

	int i = 0;
	double toll;//过路费
	while (isSuccess){
		if(money > 50000){
			toll = 0.05 * money;
			money -= toll;
			i++;
		}else if(money <= 50000 && money >= 1000){
			toll = 1000;
			money -= toll;
			i++;
		}else {
			isSuccess = false;
			break;
		}
	}
	System.out.println("该人可以经过路口的次数为：" + i);
	}
}