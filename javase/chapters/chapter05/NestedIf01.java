//参加歌手比赛，如果初赛成绩大于8.0进入决赛，否则提示淘汰。
//并且根据性别提示进入男子组或女子组。
//输入成绩和性别，进行判断和输出信息。[Nestedif.java]
// 提示：double score；char gender;
// 接收字符：char gender = scanner.next().charAt(0)

import java.util.Scanner;
public class NestedIf01{
	public static void main (String [] args){
		//1.创建输入描述对象
		Scanner scoreScanner = new Scanner (System.in);
		Scanner genderScanner = new Scanner (System.in);
		//2.获得用户输入
		System.out.println("请输入歌手成绩：");
		double score = scoreScanner.nextDouble();

		//3.核心业务逻辑，判断是否进入决赛及组别
		if (score > 8.0){
			System.out.println("成功进入决赛");
			System.out.println("请输入歌手性别：");
			char gender = genderScanner.next().charAt(0);
			if (gender == '男'){
				System.out.println("进入男子组");
			}
				else {
					System.out.println("进入女子组");
				}
		}
		else {
			System.out.println("淘汰");
		}
	}
}