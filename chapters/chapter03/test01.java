public class test01{
	//"你好，我是[名字]，今年[年龄]岁，考了[分数]分。"
	public static void main (String [] args){
		String name = "张三";
		int age = 18;
		double score = 98.5;
		System.out.printf("你好，我是%s，今年%d岁，考了%.1f分",name,age,score);
	}
}