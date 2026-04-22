//while输出10句:你好，韩顺平教育
//基本语法循环变量初始化；while（循环条件）{
// 循环体（语句）;；
// 循环变量送代；
// 说明
// while循环也有四要素
// 2）只是四要素放的位置，不一样。
public class While01{
	public static void main(String [] args){
		int i = 1;
		while (i <= 10){
			System.out.println("你好，韩顺平教育" + i);
			i++;
		}
		System.out.println("退出while，继续~");
	}
}