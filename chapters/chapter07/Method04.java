// 背景： 之前的 void 方法像是“命令工兵去干活”，干完就完了。 现在我们需要“命令侦察兵去探路”，他不仅要干活，还得带回情报（返回结果给 main 方法）。
// 需求： 请编写 Method04.java，在 Hero 类中增加两个新方法：
// 判断存活 (返回 boolean)：方法名：isAlive
// 逻辑：如果 hp > 0，返回 true；否则返回 false。
// (注意：把 void 改成 boolean，最后必须有 return)
// 计算大招伤害 (返回 int)：
// 方法名：calcDamage
// 参数：接收一个倍数 int n。
// 逻辑：计算当前攻击力 (attack) 的 n 倍是多少，并把这个结果返回去。
// (不要在方法里打印，把结果交回给 main 方法去打印)
// Main 方法测试：
// 创建英雄，攻击力设为 100。
// 调用 isAlive()，如果返回 true，打印 "英雄还活着"。
// 调用 calcDamage(5)，用一个变量接收返回值，然后打印 "大招造成了 " + 结果 + " 点伤害"。
// (提示：方法的定义格式 public 返回类型 方法名(参数列表) { ... return 结果; })s
// 加油！掌握了“返回值”，你的英雄就能和外界真正交互了！
// 
// 
public class Method04{
	public static void main(String[] args){
		
		Hero hero1 = new Hero();
		hero1.name = "亚瑟";
		hero1.attack = 100;
		hero1.hp = 20;
		//hero1.isAlive(20);

		boolean liveStatus = hero1.isAlive();
		if(liveStatus == true){
			System.out.println("英雄还活着");
		}else{
			System.out.println("英雄已经阵亡");
		}
		int damage = hero1.calcDamage(5);
		System.out.println("大招造成了" + damage + "点伤害");

	}
}

class Hero{
	//思路
	//1.方法的返回类型 boolean
	//2.方法的名字 isAlive
	//3.方法的形参 (int hp)
	//方法体，判断
	String name;
	int attack;
	int hp;
	
	public boolean isAlive(){
		if(hp > 0){
			//System.out.println("英雄还活着，血量还有" + hp);
			return true;
		}else {
			//System.out.println("英雄已经阵亡");
			return false;
		}
	}

	public int calcDamage(int n){
		return attack * n;
	}
}