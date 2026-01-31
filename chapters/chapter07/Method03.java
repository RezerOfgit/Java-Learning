


public class Method03{
	public static void main(String[] args){
		Hero hero1 = new Hero();
		hero1.name = "亚瑟";
		hero1.hp = 5000;
		hero1.attack = 200;
		hero1.speak();
		hero1.addHp(500);

		// Hero hero2 = new Hero();
		// hero2.name = "后羿";
		// hero2.hp = 3000;
		// hero2.attack = 450;

	}
}

class Hero{
	String name;
	int hp;
	int attack;

	public void speak(){
		System.out.println("我是" + name + ",我的攻击力是" + attack);
	}

	public void addHp(int num){
		hp += num;
		//return newhp;
		System.out.println("回血成功，当前血量：" + hp);
	}

}