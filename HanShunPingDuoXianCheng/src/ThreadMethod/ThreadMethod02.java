package ThreadMethod;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/31 - 12 - 31 - 17:57
 * @Description:
 * @version:1.0
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 0; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程吃了-----" + i + "个包子");

            if (i == 5) {
                System.out.println();
               // t2.join();//插队

                Thread.yield();//礼让

                System.out.println();
            }
        }

    }
}

class T2 extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 20; i++) {


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程吃了-----" + i + "个包子");
        }
    }
}