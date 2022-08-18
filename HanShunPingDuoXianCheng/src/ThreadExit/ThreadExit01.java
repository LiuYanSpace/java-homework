package ThreadExit;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/29 - 12 - 29 - 20:19
 * @Description:
 * @version:1.0
 */
public class ThreadExit01 {
    public static void main(String[] args) throws InterruptedException {
        T t1 = new T();
        t1.start();

        //主线程休眠十秒，再通知退出
        Thread.sleep(10 * 1000);
        t1.setLoop(false);
    }
}

class T extends Thread {
    int count = 0;

    //设置一个控制变量
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T线程在运行中-------" + (++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}