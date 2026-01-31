//1.打印1一100之间所有能被3整除的数
//
public class While02{
	public static void main(String [] args){
		int start = 1 ,end = 100;
		int i = start;
		while (i <= end){
			if (i % 3 == 0){
			System.out.println(i);
		}
			i++;
		}
		System.out.println("退出while，继续~");
	}
}