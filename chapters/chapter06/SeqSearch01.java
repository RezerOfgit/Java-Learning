// 有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏：
// 从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】要求：
// 如果找到了，就提示找到，并给出下标值。
// 
// 
import java.util.Scanner;
public class SeqSearch01{
	public static void main(String[] args){
		//创建一个字符串数组
		String[] name = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
		//创建描述对象
		Scanner nameScanner = new Scanner(System.in);
		System.out.println("请输入名字：");
		String findName = nameScanner.next();

		int index = -1;
		//遍历检查
		for(int i = 0; i < name.length; i++){
			if(findName.equals(name[i])){
				System.out.print("恭喜你找到" + findName);
				System.out.print("下标为" + i);
				index = i;
				break;
			}
		}
		if(index == -1){
			System.out.print("未找到" + findName);
		}
	}
}