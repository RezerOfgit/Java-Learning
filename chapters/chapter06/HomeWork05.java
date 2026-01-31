// 5.随机生成10个整数（1-100的范围）保存到数组，
// 并倒序打印以及求平均值、求最大值和最大值的下标、并查找里面是否有8。

public class HomeWork05{
	public static void main(String[] args){
		//确定数组大小和元素
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100 + 1);
		}

		//显示生成的数组
		System.out.println("随机生成的数组为：");
		for(int i : arr) System.out.print(i + "\t");

		//倒序打印
		System.out.println("\n倒序打印结果：");
		for(int i = arr.length - 1; i >= 0; i--){
			System.out.print(arr[i] + "\t");
		}

		//求平均值、max、min的下标
		int sum = 0;
		int findNum = 8;
		int max = arr[0], maxIndex = 0;
		int min = arr[0], minIndex = 0;
		int index = -1;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];

			if(max < arr[i]){
				max = arr[i];
				maxIndex = i;
			}
			if(min > arr[i]){
				min = arr[i];
				minIndex = i;
			}
			if(arr[i] == findNum){
                System.out.println("找到了数字 " + findNum + "，下标为：" + i);
                index = i; // 只要找到一次，index 就变了
            }
		}
		double average = sum * 1.0 / arr.length;

		if (index == -1){
				System.out.println("\n这组数据中不含有8");
			}
		System.out.println("平均值 = " + average);
		System.out.println("最大值为：" + max + "，下标为：" + maxIndex);
		System.out.println("最小值为：" + min + "，下标为：" + minIndex);
	}
}
