package ThreadMethod;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/31 - 12 - 31 - 18:26
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class ThreadExercise {
    public static void main(String[] args) throws InterruptedException {

        /*T3 t3 = new T3();
        Thread thread = new Thread(t3);
         */

        Thread t3 = new Thread(new T3());

        for (int i = 1; i <= 10; i++) {
            System.out.println("hi" + i);

            if (i == 5){
                t3.start();
                t3.join();
            }

            Thread.sleep(1000);
        }
    }
}

class T3 implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        while (true) {

            System.out.println("hello" + (++count));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10){
                break;
            }
        }
    }
}
