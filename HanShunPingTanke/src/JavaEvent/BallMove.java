package JavaEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/28 - 12 - 28 - 17:10
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
//键盘控制球球的移动
public class BallMove extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();

    }

    //构造器
    public BallMove() {
        MyPanel mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);

        //窗口JFrame 对象可以监听到面板发生的键盘事件
        this.addKeyListener(mp);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}

//面板
//KeyListener监听器，监听键盘事件
class MyPanel extends JPanel implements KeyListener {

    //为了让小球可以移动，左上角的坐标（x,y）设置成变量
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.fillOval(x, y, 20, 20);//默认黑色


    }

    @Override
    public void keyTyped(KeyEvent e) {//有字符输出的时候，该方法就会触发

    }

    @Override
    public void keyPressed(KeyEvent e) {//当某个键按下去的时，该方法触发
        System.out.println((char) e.getKeyCode() + "被按下");
        //根据用户按下的不同的键，来处理小球的移动

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {

            y++;

        }else if(e.getKeyCode() == KeyEvent.VK_UP){
            y--;
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x--;
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
        }

        //让面板重绘
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {//当某个键释放或者说松开了某个键，该方法触发

    }
}