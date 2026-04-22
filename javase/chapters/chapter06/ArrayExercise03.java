// 你正在关注一支股票最近 5 天的收盘价。
// 你要找出这一周里股价最低的是哪一天，以便将来复盘“抄底”时机。
// 数据： {30.5, 29.8, 32.0, 28.1, 31.5}


public class ArrayExercise03{
	public static void main(String [] args){
		double[] price = {30.5, 29.8, 32.0, 28.1, 31.5};
		double min = price[0];
		int day = 1;
		for (int i = 1; i < price.length; i++){
			if(min > price[i]){
				min = price[i];
				day = i + 1;
			}
		}
		System.out.println("股价最低是" + day + "天，价格是" + min);
	}
}