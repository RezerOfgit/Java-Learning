// Homework01.java
// 1.编写类A01，定义方法max，实现求某个double数组的最大值，并返回
public class Homework01{
    public static void main(String[] args){
    	double[] arr = {1, 2.1, 3, 4.5, 6.7};
    	A01 a = new A01();
    	Double res = a.max(arr);
    	if(res != null){
    		System.out.println("最大值=" + res);
    	}else{
    		System.out.println("数组有错误");
    	}
    	

    }
}
class A01{
	public Double max(double...nums){
		if (nums == null || nums.length == 0) {
			return null;
		}		
		double max = nums[0];
		for(int i = 1; i < nums.length; i++){
			max = max > nums[i] ? max : nums[i];
		}
		return max;
	}
}