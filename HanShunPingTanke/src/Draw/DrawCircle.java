package Draw;

import javax.swing.*;
import java.awt.*;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/28 - 12 - 28 - 15:02
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class DrawCircle extends JFrame {
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        //初始化面板
        MyPanel mp = new MyPanel();
        //把面板放入到窗口
        this.add(mp);
        //设置窗口大小
        this.setSize(400, 300);

        //点击窗口的退出，程序就退出了
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //可以显示
        this.setVisible(true);
    }
}

//1.定义一个MyPanel
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //画出一个圆
        g.drawOval(10, 10, 100, 100);
    }
}