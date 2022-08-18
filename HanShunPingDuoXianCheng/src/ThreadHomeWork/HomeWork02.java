package ThreadHomeWork;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/3 - 01 - 03 - 21:57
 * @Description:
 * @version:1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        T t = new T();
        Thread thread1 = new Thread(t);
        thread1.setName("t1");
        Thread thread2 = new Thread(t);
        thread2.setName("t2");
        thread1.start();
        thread2.start();

    }
}

//涉及多个线程共享资源，所以我们使用runnable
class T implements Runnable {
    private int money = 10000;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                //判断余额是否够
                if (money < 1000) {
                    System.out.println("余额不足");
                    break;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() + "取出了1000 当前余额=" + money);
            }
            //休眠1S
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}