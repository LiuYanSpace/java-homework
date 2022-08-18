package SellThread;

/*
*
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/29 - 12 - 29 - 19:48
 * @Description:
 * @version:1.0

@SuppressWarnings({"all"})
public class SellTicket {
    public static void main(String[] args) {
        //继承thread的方法

        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();

        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();



        //Runnable方法
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();


    }
}


//继承thread的方法
class SellTicket01 extends Thread {
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束-----");
                break;
            }

            //休眠50毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票-----" + "还剩余" +
                    (--ticketNum) + "张票");
        }
    }
}



class SellTicket02 implements Runnable {
    private  int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束-----");
                break;
            }

            //休眠50毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票-----" + "还剩余" +
                    (--ticketNum) + "张票");
        }
    }
}
 */