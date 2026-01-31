public class Object02{
	public static void main(String[] args){
		Hero hero1 = new Hero();
		hero1.name = "亚瑟";
		hero1.hp = 5000;
		hero1.attack = 200;

		Hero hero2 = new Hero();
		hero2.name = "后羿";
		hero2.hp = 3000;
		hero2.attack = 450;

		System.out.println("第1个英雄的信息：" + hero1.name + " " +
			hero1.hp + " " + hero1.attack);
		System.out.println("第2个英雄的信息：" + hero2.name + " " + 
			hero2.hp + " " + hero2.attack);
	}
}
class Hero{
	String name;
	int hp;
	int attack;
}