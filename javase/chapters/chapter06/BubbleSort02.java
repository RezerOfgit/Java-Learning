// BubbleSort01
// 
// 背景： 你正在开发一款游戏。现在有 5 位英雄的战斗力数据，但是是乱序的。 我们需要把它们从大到小（降序）排列，最强的排在第一个，生成“全服排行榜”。

// 数据： int[] power = {160, 15, 240, 30, 80};

// 目标效果： 排序后数组变为：{240, 160, 80, 30, 15}
// 
public class BubbleSort02{
	public static void main(String[] args){
		int[] power = {160, 15, 240, 30, 80};
		int temp = 0;
		for(int i = 0; i < power.length - 1; i++){
			for(int j = 0; j < power.length - 1 - i; j++){
				if(power[j] < power[j + 1]){
					temp = power[j + 1];
					power[j + 1] = power[j];
					power[j] = temp;
				}
			}
			System.out.println("\n===第" + (i + 1) + "次排序结果===");
			for(int j = 0; j < power.length; j++){
				System.out.print(power[j] + "\t");
			}
		
		}
	}
}