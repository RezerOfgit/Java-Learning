// 有三个方法，分别实现返回姓名和两门课成绩（总分），
// 返回姓名和三门课成绩（总分），返回姓名和五门课成绩（总分）。
// 封装成一个可变参数的方法
// 类名 HspMethod 方法名 showScore

public class VarParameterExercise{
	public static void main(String[] args){
		HspMethod m = new HspMethod();

		System.out.println(m.showScore("苏佳成", 65.5, 70));
		System.out.println(m.showScore("苏佳", 65.5, 70, 80));
		System.out.println(m.showScore("苏成", 65.5, 70, 67, 80.5, 95));
	}
}
class HspMethod{
	public String showScore(String name, double...scores){
		double sumScore = 0;
		for(int i = 0; i < scores.length; i++){
			sumScore += scores[i];
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		return name + "有" + scores.length + "门课的总成绩=" + sumScore;
	}
}