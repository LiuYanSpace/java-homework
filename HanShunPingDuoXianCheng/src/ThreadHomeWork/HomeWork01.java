package ThreadHomeWork;

import java.util.Scanner;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/3 - 01 - 03 - 21:29
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class HomeWork01 {
    public static void main(String[] args) {
        A a = new A();
        a.start();

        B b = new B(a);
        b.start();
    }
}

class A extends Thread {
    private boolean loop = true;

    @Override
    public void run() {
        //输出1——100数字
        while (loop) {
            System.out.println((int) (Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("a线程退出----");
    }

    public void setLoop(boolean loop) {//修改loop变量
        this.loop = loop;
    }
}

class B extends Thread {
    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) {//构造器传入A类对象
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            //接收到用户输入
            System.out.println("请输入你的指令(Q)表示退出：");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                //以通知的方式结束A线程
                a.setLoop(false);
                System.out.println("b线程退出");
                break;
            }
        }
    }
}
