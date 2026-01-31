// 创建一个char类型的26个元素的数组，分别放置'A'-'Z‘。
// 使用for循环访问所有元素并打印出来。
// 提示：char类型数据运算A'+1->‘B',,ArrayExercise01.java
// 
// 
public class ArrayExercise01{
	public static void main(String [] args){
		char[] chars = new char[26];
		char A;
		for (int i = 0; i < chars.length; i++){
			chars[i] = (char) ('A' + i);
			System.out.println("请输入第" + (i + 1) + "个字母：" + chars[i]);
		}
	}
}