// 请编写 MethodExercise02.java，使用 Heseiya 类
// 需求： 编写一个方法 showScore。
// 它可以接收一个学生的名字 (String name)。
// 它可以接收任意多门课的成绩 (double... scores)。
// 功能：计算这名学生所有课程的总分，并打印："xx 同学的总分是：yy"。
// 细节要求:
// 必须使用可变参数。
// 在方法里，把 scores 当作数组遍历累加。
// 测试 (Main)：
// showScore("赫森亚", 90.5, 80.0) (两门课)
// showScore("学霸", 100, 100, 100, 100, 100) (五门课)

public class VarParameterExercise02{
	public static void main(String[] args){
		Heseiya m = new Heseiya();
		System.out.println(m.showScore("赫森亚", 90.5, 80.0));
		System.out.println(m.showScore("学霸", 100, 100, 100, 100, 100));
	}
}
class Heseiya{
	public String showScore(String name, double...scores){
		double sumScore = 0;
		for(int i = 0; i < scores.length; i++){
			sumScore += scores[i];
		}
		return name + "同学的总分是：" + sumScore;
	}
}