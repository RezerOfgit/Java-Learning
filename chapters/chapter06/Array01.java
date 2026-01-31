

public class Array01{
	public static void main(String [] args){
		double[] hens = {3,5,1,3.4,2,50};
		double totalWeight = 0;
		for (int i = 0; i < hens.length; i++){
			System.out.println("第" + (i + 1) + "个元素的值=" + hens[i]);
			totalWeight += hens[i];
		}
		System.out.println("平均体重=" + totalWeight / hens.length);
	}
}