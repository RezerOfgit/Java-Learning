package com.rezero.draw;
import javax.swing.*;
import java.awt.*;

/**
 * @author Re-zero
 * @version 1.0
 */
public class ToadDraw extends JFrame{
    //定义ToadPanel
    ToadPanel mp = null;
    public static void main(String[] args) {
        ToadDraw toadDraw = new ToadDraw();
    }
    public ToadDraw(){
        mp = new ToadPanel();
        mp.setBackground(Color.WHITE);//设置面板背景为白色
        mp.setOpaque(true);//设置面板为不透明
        this.add(mp);//面板
        this.setSize(1000, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class ToadPanel extends JPanel {
    //定义一只蛤蟆
    Toad toad = null;
    public ToadPanel(){
        toad = new Toad(400, 400);//初始化蛤蟆
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //g.fillRect(0, 0, 1000, 750);//填充矩形,默认黑色
        //画出蛤蟆-封装方法
        drawToad(toad.getX(),toad.getY(),g,0);
    }

    /**
     *
     * @param x 蛤蟆的左上角x坐标
     * @param y 蛤蟆的左上角y坐标
     * @param g 画笔
     * @param type 蛤蟆类型
     */
    public void drawToad(int x, int y, Graphics g, int type) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(5.0f));
        switch (type) {
            case 0:
                g.setColor(Color.GREEN);
                g.fillOval(x - 200, y - 300, 400, 300);//画出脸
                g.fillOval(x - 100, y - 100, 200, 300);//画出身体


                g.fillOval(x - 200, y + 50, 200, 100);//画出左后腿
                g.fillOval(x - 180, y + 100, 50, 80);//画出左后脚
                g.fillOval(x, y + 50, 200, 100);//画出右后腿
                g.fillOval(x + 130, y + 100, 50, 80);//画出右后脚
                g.fillOval(x - 130, y + 160, 100, 50);//画出左前脚
                g.fillOval(x + 30, y + 160, 100, 50);//画出右前脚
                g.setColor(Color.BLACK);
                g2d.drawOval(x - 200, y - 300, 400, 300);//画出脸轮廓

                g.setColor(Color.WHITE);
                g.fillOval(x - 50, y + 150, 100, 200);//画出腹部部分
                g.fillOval(x - 100, y - 350, 100, 100);//画出左眼
                g.fillOval(x, y - 350, 100, 100);//画出右眼

                g.setColor(Color.PINK);
                g.fillOval(x - 175, y - 190, 50, 80);//画出左脸腮红
                g.fillOval(x + 125, y - 190, 50, 80);//画出右脸腮红

                g.setColor(Color.BLACK);
                g.fillOval(x - 65, y - 315, 30, 30);//画出左眼瞳孔
                g.fillOval(x + 35, y - 315, 30, 30);//画出左眼瞳孔

                g2d.drawLine(x,y - 185,x,y - 165);//画出鼻子
                g2d.drawLine(x - 20,y - 180,x - 10,y - 165);
                g2d.drawLine(x + 20,y - 180,x + 10,y - 165);

                g2d.drawLine(x - 100,y - 100,x,y - 50);//画出嘴巴
                g2d.drawLine(x + 100,y - 100,x,y - 50);

                g2d.drawOval(x - 175, y - 190, 50, 80);//画出左脸腮红轮廓
                g2d.drawOval(x + 125, y - 190, 50, 80);//画出右脸腮红轮廓

                g2d.drawOval(x - 100, y - 350, 100, 100);//画出左眼轮廓
                g2d.drawOval(x, y - 350, 100, 100);//画出右眼轮廓

                g.setFont(new Font("隶书", Font.BOLD, 50));
                g.drawString("by Re-zero",600, 500);
                break;
        default:
            System.out.println("暂时没有处理...");
        }
    }
}
class Toad{
    private int x;//蛤蟆的横坐标
    private int y;//蛤蟆的纵坐标

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Toad(int x, int y) {
        this.x = x;
        this.y = y;
    }
}