// 场景： 我们有 3 个班级，每个班有 4 名学生。 
// 我们在寻找学号为 "2-3" (第2个班，第3个学生) 的幸运锦鲤。

public class Break01{
	public static void main(String [] args){
		classroom:
		for(int i = 1; i <= 3; i++){
			stu:
			for(int j = 1; j <= 4; j++){
				if (i == 2 && j == 3){
					System.out.println("学号为" + i + "-" + j+ "的学生为幸运锦鲤");
					break;
				}

			}
		}
	}
}
