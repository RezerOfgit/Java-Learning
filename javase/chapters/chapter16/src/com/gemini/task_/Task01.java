package com.gemini.task_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task01 {
    /*
    请尝试修改 MyPanel 的初始化代码，完成以下效果:

交错排列：现在的敌人坦克是排成一排 (100 * (i + 1)), 0)。
请修改代码，让敌人坦克变成 斜着排（X 和 Y 都要变化）。
提示：new EnemyTank(100 * (i + 1), ?)

EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), (100 * i));

颜色区分：虽然现在还没讲怎么设置敌人颜色，但如果让你给第 3 辆坦克（索引为 2）
设置一个特殊的属性（比如方向不同），你应该在 MyPanel 的哪个循环里写 if 判断？

(1)先在drawTank方法中:switch (type)新增颜色类型
            case 2://敌人的坦克
                g.setColor(Color.RED);
                break;
(2)在paint方法中修改敌人坦克:
        //画出敌人的坦克,遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            if (i == 2) {
                drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),2);
            }else
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),1);
        }
     */
}
