// 4.编写类A04，实现数组的复制功能copyArr，输入旧数组，返回一个新数组，
// 元素和旧数组一样
// public class Homework04{
//     public static void main(String[] args){
//     	A04 a = new A04();
//     	double[] arr = {1, 2, 3};
//     	a.copyArr(arr);
//     }
// }
// class A04{
// 	public void copyArr(double[] arr){
// 		double[] copyarr = new double[arr.length];
// 		for(int i = 0; i < arr.length; i++){
// 			copyarr[i] = arr[i];
// 		}
// 		System.out.println("新数组为：");
// 		for(double i : copyarr){
// 			System.out.print(i + " ");
// 		}
// 	}
// }
public class Homework04{
    public static void main(String[] args){
    	double[] arr = {1, 2, 3};
    	A04 a = new A04();
    	double[] copyarr = a.copyArr(arr);
    	System.out.println("==返回的copyarr元素情况==");
		for(int i = 0; i < copyarr.length; i++){
			System.out.print(copyarr[i] + " ");
		}
    }
}
class A04{
	public double[] copyArr(double[] arr){
		double[] copyarr = new double[arr.length];
		for(int i = 0; i < arr.length; i++){
			copyarr[i] = arr[i];
		}
		return copyarr;
	}
}