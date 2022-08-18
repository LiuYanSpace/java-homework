package ThreadMethod;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/31 - 12 - 31 - 19:14
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        for (int i = 0; i < 10; i++) {//主线程
            System.out.println("工作");
            Thread.sleep(1000);
        }
    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for (; ; ) {//无限循环
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("聊天");
        }
    }
}