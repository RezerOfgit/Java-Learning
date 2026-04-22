// 编写类AA，有一个方法：判断一个数是奇数odd还是偶数，返回boolean

public class MethodExercise01{
	public static void main(String[] args){
		AA a = new AA();
		boolean b = a.isOdd(23);
	}
}

class AA{
	//思路
	//1.方法的返回类型 boolean
	//2.方法的名字 isOdd
	//3.方法的形参 (int num)
	//方法体，判断

	public boolean isOdd(int num){//奇数
		if(num % 2 != 0){
			
			System.out.println("是奇数");
			return true;
		}else {
			
			System.out.println("是偶数");
			return false;
		}
		
	}

}