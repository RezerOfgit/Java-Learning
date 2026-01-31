// 构造器 (Constructor) 就是为了解决这个问题。
// 它允许你在 new 对象的那一瞬间，就把属性全填好。 
// 目标代码：Hero h = new Hero("亚瑟", 5000, 200); （一行搞定！）


public class Constructor02{
    public static void main(String[] args){
        Hero hero = new Hero("亚瑟", 5000, 200);
        System.out.println(hero.name + "的血量是：" + hero.hp + ",攻击力是：" + 
            hero.attack);
    }
}
class Hero{
    String name;
    int hp;
    int attack;
    //构造器
    //1.构造器没有返回值，也不能写void
    //2.构造器的名称和类Hero一样
    //3.(String pName, int pAge) 是构造器形参列表，规则和成员方法一样
    public Hero(String pName, int pHp, int pAttack){
        System.out.println("构造器被调用~~完成对象的属性的初始化");
        name = pName;
        hp = pHp;
        attack = pAttack;
    }
}