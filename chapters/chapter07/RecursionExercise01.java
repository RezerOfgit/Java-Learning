// RecursionExercise01.java
// 1.请使用递归的方式求出斐波那契数1，1, 2，3，5，8，13...
// 给你一个整数n，求出它的值是多

public class RecursionExercise01{
	public static void main(String[] args){
		T t1 = new T();
		int res = t1.fibNum(10);
		System.out.println("res =  " + res);
	}
}
class T{//Fibonacci number
	public int fibNum(int n){
		if(n <= 2){
			return 1;
		}else{
			return fibNum(n - 1) + fibNum(n - 2);
		}
	}
}