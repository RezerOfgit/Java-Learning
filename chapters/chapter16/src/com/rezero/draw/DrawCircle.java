package com.rezero.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author Re-zero
 * @version 1.0
 * 演示如何在面板上画出圆形
 */
@SuppressWarnings({"all"})
public class DrawCircle extends JFrame{//JFrame对应窗口，可以理解成是一个画框
    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序...");
    }
    public DrawCircle(){//构造器
        //初始化面板
        mp = new MyPanel();
        this.add(mp);
        //设置窗口的大小
        this.setSize(400,300);
        //当点击窗口的小x,程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}
//1. 先定义一个MyPanel, 继承JPanel类, 画图形, 就在面板上画
class MyPanel extends JPanel{
    // Graphics g说明：
    //1. MyPanel 对象就是一个画板
    //2. Graphics g 把 g 理解成一支画笔
    //3. Graphics 提供了很多绘图的方法
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类的方法完成初始化
        System.out.println("paint 方法被调用...");;
        //画出一个圆形
        g.drawOval(10,10,100,100);
        /*
        这个方法有四个参数，它们共同定义了椭圆的位置和大小：
        int x：椭圆外接矩形的左上角的 X 坐标。
        int y：椭圆外接矩形的左上角的 Y 坐标。
        int width：椭圆外接矩形的宽度。
        int height：椭圆外接矩形的高度。
         */

        //演示回执不同的图像:
        //画直线 drawLine(int x1,int y1,int x2,int y2)
        g.drawLine(10,20,100,100);
        //画矩形边框 drawRect(int x,int y,int width,int height)
        g.drawRect(20,30,100,150);
        //画椭圆边框 drawOval(int x,int y,int width,int height)
        g.drawOval(10,10,100,200);
        //填充矩形 fillRect(int x,int y,int width,int height)
        g.setColor(Color.PINK);
        g.fillRect(20,20,50,80);
        //填充椭圆 fillOval(int x,int y,int width,int height)
        g.setColor(Color.BLUE);
        g.fillOval(10,20,100,50);
        //画图片 drawImage(Image img, int x, int y, .)
        //1. 获取图片资源,/ai.jpg 表示在该项目的根目录去获取 ai.jpg 图片资源
        //Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/ai.jpg"));
        // "/ai.jpg" 表示去 classpath 的根目录找，也就是 src 的根目录
        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/ai.jpg"));
        g.drawImage(image, 50, 50, 200, 200, this);
        //怎样读取电脑本地的图片（绝对路径）
        // Windows 系统路径要注意转义，用双反斜杠 \\
        // 或者直接用正斜杠 / 也可以： "D:/images/tank.jpg"
//        Image image02 = Toolkit.getDefaultToolkit().getImage("D:\\\\my_photos\\\\ai.jpg");
//        g.drawImage(image02, 20, 20, 50, 50, this);
        //画字符串 drawString(String str,int x,int y)//写字
        //给画笔设置颜色和字体
        g.setColor(Color.red);
        g.setFont(new Font("隶书", Font.BOLD, 50));
        //对于汉字（方块字）来说，(100, 100) 确实看起来很像左下角。
        // 但是对于英文字母（比如 "g", "j", "y", "p", "q"），(100, 100) 指的是 基准线 (Baseline)。
        g.drawString("北京你好gyj",10, 100);
        //设置画笔的字体 setFont(Font font)
        //设置画笔的颜色 setColor(Color c)

    }
}