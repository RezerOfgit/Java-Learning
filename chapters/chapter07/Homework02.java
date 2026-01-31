// 2.编写类A02，定义方法find，实现查找某字符串数组中的元素查找，
// 并返回索引l，如果找不到，返回-1.
public class Homework02{
    public static void main(String[] args){
		String[] strs = {"你好", "名字", "sunday"};//null;//{};//
		String a = "名字";
    	A02 a2 = new A02();
    	int index = a2.find(a, strs);
    	if(index != -1){
    		System.out.println("查找的index=" + index);
    	}else{
    		System.out.println("未查到");
    	}
    }
}
class A02{
	public int find(String findStr, String[] strs){
		if (findStr == null ||strs == null || strs.length == 0) {
			return -1;
		}
		for(int i = 0; i < strs.length; i++){
			if(findStr.equals(strs[i])){
				return i;
			}		
		}
		return -1;
	}
}
