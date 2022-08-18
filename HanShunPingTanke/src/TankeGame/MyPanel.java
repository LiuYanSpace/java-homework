package TankeGame;

import com.sun.deploy.panel.JavaPanel;

import java.awt.*;
/*
int x ,
int y ,
Graphics g ,
 int direction ,
 int type

 */

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/28 - 12 - 28 - 15:48
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class MyPanel extends JavaPanel {
    //定义我的坦克
    MyTank myTank = null;

    public MyPanel() {
        myTank = new MyTank(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);

        //画出坦克，封装到方法
        drawTank(myTank.getX(), myTank.getY(), g, 0, 0);
        //drawTank(myTank.getX() + 60, myTank.getY(), g, 0, 0);
        //drawTank(myTank.getX(), myTank.getY(), g, 0, 1);
        //drawTank(myTank.getX(), myTank.getY(), g, 0, 1);
    }

    //编写方法，画出坦克
    public void drawTank(int x, int y, Graphics g, int direction, int type) {

        //根据不同的坦克类型设置不同的颜色
        switch (type) {
            case 0://我们自己的坦克
                g.setColor(Color.cyan);
            case 1://敌方坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克的方向来绘制坦克
        switch (direction) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);//画出坦克的左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克中间的盖子
                g.fillOval(x + 10, y + 20, 20, 20);//圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            default:
                System.out.println("暂时没有处理");
        }

    }
}

