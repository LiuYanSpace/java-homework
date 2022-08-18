package TankGame02;

import com.sun.deploy.panel.JavaPanel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;
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
public class MyPanel extends JavaPanel implements KeyListener {
    //定义我的坦克
   MyTank myTank = null;

   //定义敌方坦克
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankeSize = 3;

    public MyPanel() {

        myTank = new MyTank(100, 100);
        //myTank.setSpeed(5);自己设置速度

        for(int i = 0; i < enemyTankeSize; i++){
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            enemyTank.setDirection(2);
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);

        //画出自己的坦克，封装到方法
        drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirection(), 1);
        //drawTank(myTank.getX() + 60, myTank.getY(), g, 0, 0);
        //drawTank(myTank.getX(), myTank.getY(), g, 0, 1);
        //drawTank(myTank.getX(), myTank.getY(), g, 0, 1);

        //画出敌方坦克，遍历vector
        for(int i = 0; i < enemyTanks.size(); i++){
           //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 0);

        }

    }

    //编写方法，画出坦克
    public void drawTank(int x, int y, Graphics g, int direction, int type) {

        //根据不同的坦克类型设置不同的颜色
        switch (type) {
            case 0://敌方的坦克
                g.setColor(Color.cyan);
                break;
            case 1://我们的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克的方向，来绘制对应形状的坦克
        switch (direction) {//direction表示方向，0向上，1向右 23
            case 0://表示坦克向上
                g.fill3DRect(x, y, 10, 60, false);//画出坦克的左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克中间的盖子
                g.fillOval(x + 10, y + 20, 20, 20);//圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1://表示坦克向右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克的左边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画右边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克中间的盖子
                g.fillOval(x + 20, y + 10, 20, 20);//圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2://表示坦克向下
                g.fill3DRect(x, y, 10, 60, false);//画出坦克的左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克中间的盖子
                g.fillOval(x + 10, y + 20, 20, 20);//圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3://表示坦克向左
                g.fill3DRect(x, y, 60, 10, false);//画出坦克的左边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画右边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克中间的盖子
                g.fillOval(x + 20, y + 10, 20, 20);//圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:
                System.out.println("暂时没有处理");
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            //按下W键，改变坦克方向
            //修改坦克坐标
            myTank.setDirection(0);
            myTank.moveUp();

        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            myTank.setDirection(1);
            myTank.moveRight();

        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            myTank.setDirection(2);
            myTank.moveDown();

        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            myTank.setDirection(3);
            myTank.moveLeft();

        }
        //让面板重绘坦克
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

