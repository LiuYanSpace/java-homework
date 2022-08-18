package TankGame02;



import javax.swing.*;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/28 - 12 - 28 - 15:53
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class TankGame2 extends JFrame {
    //定义一个MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {

        TankGame2 tankGame01 = new TankGame2();
    }

    public TankGame2() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.addKeyListener(mp);//增加键盘监听事件
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}
