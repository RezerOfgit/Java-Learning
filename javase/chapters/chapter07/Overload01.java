// 请编写 Overload01.java，创建一个 WeaponMaster (武器大师) 类，
// 利用方法重载实现三种不同的射击方式：
// 无参射击：方法名：fire,参数：无。功能：默认打印 "使用 激光枪 射击！"
// 单参射击 (指定武器)：方法名：fire。参数：String weapon。
// 功能：打印 "使用 " + weapon + " 射击！"
// 双参射击 (指定武器 + 连发)：方法名：fire，参数：String weapon, int count (次数)
// 功能：打印 "使用 " + weapon + " 疯狂射击 " + count + " 次！"
// 测试 (Main)：
// 实例化对象。
// 依次调用这三个方法，看看它们会不会打架？
// (提示：Java 会自动根据你塞进去的参数，自动导航到对应的方法，非常智能。)

public class Overload01{
	public static void main(String[] args){
		WeaponMaster wma = new WeaponMaster();
		wma.fire();
		wma.fire("gun");
		wma.fire("gun", 5);
	}
}
class WeaponMaster{
	public void fire(){
		System.out.println("使用 激光枪 射击！");
	}
	public void fire(String weapon){
		System.out.println("使用" + weapon + " 射击！");
	}
	public void fire(String weapon, int count){
		System.out.println("使用" + weapon + " 疯狂射击！" + count + " 次！");
	}
}