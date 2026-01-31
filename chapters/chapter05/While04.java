
public class While03{
	public static void main(String [] args){
		int start = 40 ,end = 200;
		int i = start;
		while (i <= end){
			if (i % 2 == 0){
			System.out.println(i);
		}
			i++;
		}
		System.out.println("退出while，继续~");
	}
}