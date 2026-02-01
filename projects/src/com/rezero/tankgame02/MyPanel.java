package com.rezero.tankgame02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author Re-zero
 * @version 1.0
 */
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    Hero hero = null;
    //定义敌人坦克,放入到Vector
    Vector<EnemyTank> enemyTanks = new Vector();
    int enemyTankSize = 3;

    public MyPanel() {
        hero = new Hero(100, 100);//初始化自己坦克
        hero.setSpeed(10);

        //初始化敌人坦克
        for (int i = 0; i < enemyTankSize; i++) {
            //创建一个敌人的坦克
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), (100 * i));
            //设置方向
            enemyTank.setDirect(2);
            //加入
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形,默认黑色

        //画出自己坦克-封装方法
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);

        //画出敌人的坦克,遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
//            EnemyTank t1 = enemyTanks.get(0);
//            t1.setDirect(3); // 修改 t1 的方向
//            drawTank(t1.getX(),t1.getY(),g,t1.getDirect(),1);
            // 请问：enemyTanks 集合里存的那个坦克的方向变了吗？
            EnemyTank enemyTank = enemyTanks.get(i);
            if (i == 2) {
                drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),2);
            }else
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),1);
        }

    }

    //编写方法,画出坦克

    /**
     * @param x      坦克的左上角x坐标
     * @param y      坦克的左上角y坐标
     * @param g      画笔
     * @param direct 坦克方向
     * @param type   坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        //根据不同类型的坦克,设置不同的颜色
        switch (type) {
            case 0://我们的坦克
                g.setColor(Color.CYAN);
                break;
            case 1://敌人的坦克
                g.setColor(Color.YELLOW);
                break;
            case 2://敌人的坦克
                g.setColor(Color.RED);
                break;
        }

        //根据坦克方向,来绘制对应形状坦克
        //direct 表示方向(0:向上 1:向右 2:向下 3:向左)
        switch (direct) {
            case 0://表示向上
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克中间
                g.fillOval(x + 10, y + 20, 20, 20);//画出坦克圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//画出坦克炮筒
                break;
            case 1://表示向右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克中间
                g.fillOval(x + 20, y + 10, 20, 20);//画出坦克圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出坦克炮筒
                break;
            case 2://表示向下
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克中间
                g.fillOval(x + 10, y + 20, 20, 20);//画出坦克圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出坦克炮筒
                break;
            case 3://表示向左
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克中间
                g.fillOval(x + 20, y + 10, 20, 20);//画出坦克圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);//画出坦克炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理WDSA 键按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {//按下W键
            System.out.println("xx");
            //改变坦克的方向
            hero.setDirect(0);
            //修改坦克的坐标 y -= 1
            hero.moveUP();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {//按下D键
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {//按下S键
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {//按下A键
            hero.setDirect(3);
            hero.moveLeft();
        }
        //让面板重绘
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
