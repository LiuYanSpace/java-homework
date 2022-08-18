package ThreadMethod;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/30 - 12 - 30 - 11:49
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("你好");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

       // System.out.println(t.getName());

        //
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi" + i);
        }

        System.out.println(t.getName() + t.getPriority());

        t.interrupt();
    }
}

class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "吃包子-----------");

            }

            try {
                System.out.println(Thread.currentThread().getName() + "休眠中-------");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被interrupt了");
            }

        }
    }
}