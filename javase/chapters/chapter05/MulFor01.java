// 统计3个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分
// 键盘输入
// 2统计三个班及格人数，每个班有5名同学。
// 
import java.util.Scanner;
public class MulFor01{
	public static void main(String [] args){
		//三个班级(1)(2)(3)
		//每个班级5个人，输入成绩double
		//1.创建描述对象
		//
		//
		//
		//
		Scanner scoreScanner = new Scanner (System.in);
		double totalscore = 0;//所有班级的总成绩
		int passNum = 0;//统计过及格线人数
		//先统计一个班的成绩情况
		for (int i = 1; i <= 3; i++){//i表示班级
			double sum = 0;//一个班级的总分
			for (int j = 1; j <= 5; j++){
				System.out.println("请输入" + i + "班第" + j + "个学生成绩");
				double score = scoreScanner.nextDouble();
				if (score >= 60){
					passNum++;
				}
				sum += score;
				System.out.println("成绩为" + score);
				}
				System.out.println(i + "班总成绩为：" + sum + "平均分为：" + (sum / 5));
				totalscore += sum;
			}
			System.out.println("3个班总分为：" + totalscore + "平均分为：" + totalscore / 15);
			System.out.println("及格人数为" + passNum);
	}
		
}