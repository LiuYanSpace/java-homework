package Thread;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/29 - 12 - 29 - 18:22
 * @Description:
 * @version:1.0
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
    //创建Cat对象，当做线程使用
        Cat cat = new Cat();
        cat.start();//启动线程
        //main启动 子线程时，主线程不会阻塞
        System.out.println("主线程名 = " + Thread.currentThread().getName());
        for(int i = 0; i < 60; i++){
            System.out.println("主线程 i =" + i);
            Thread.sleep(1000);
        }
    }
}

class Cat extends Thread{

    int times = 0;
   @Override
    public void run(){//重写run方法，写上自己的业务代码

       while (true) {
           //每隔一秒输出“我是喵喵，小猫咪”
           System.out.println("我是喵喵，小猫咪" + (++times) + "线程名=" + Thread.currentThread().getName());
           //让该线程休眠1秒 ctrl+alt +t
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

           if(times == 80){//输出8次就退出程序
               break;
           }
       }
   }
}