package com.hspedu.gemini_.task01;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Adventurer {
    private String name;
    private Weapon weapon;

    public Adventurer(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void fight(String enemyType){
        if ("Boss".equals(enemyType)){
            weapon = WeaponFactory.getBow();
        }else {
            weapon = WeaponFactory.getSword();
        }
        System.out.print("冒险家:" + name);
        weapon.attack();

    }
}
