// 对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
// （注：输入的成绩不能大于100），提示成绩/60
import java.util.Scanner;
public class SwitchExercise02{
	public static void main (String [] args){
		//1.创建描述对象
		Scanner gradeScanner = new Scanner (System.in);

		//2.获得用户输入信息
		System.out.println("请输入成绩(0-100)：");
		int grade = gradeScanner.nextInt();

		//3.业务核心逻辑，Switch
		switch ((int)(grade / 60)){
			case 0:
			System.out.println("不及格");
			break;

			case 1:
			System.out.println("及格");
			break;

			default:
			System.out.println("输入错误");
        // 如果上面都不匹配，就执行这里 (相当于 else)
        	break;
		}
	}
}