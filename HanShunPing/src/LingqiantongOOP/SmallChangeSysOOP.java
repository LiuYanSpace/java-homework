package LingqiantongOOP;
//该类完成零钱通的各个功能的类
//面向对象编程
//将各个功能对应一个方法

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/18 - 12 - 18 - 21:40
 * @Description:
 * @version:1.0
 */
public class SmallChangeSysOOP {

    //属性

    //1.菜单，定义相关的变量
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    //2.完成零钱通明细
    String details = "------------零钱通明细-----------";

    //3.收益入账，定义新的变量
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    //4.消费，定义新变量
    String note;

    //1.先完成显示菜单，并可以选择
    public void mainMenu() {
        do {
            System.out.println("\n===============选择零钱通菜单==============");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退      出");

            System.out.println("请选择（1-4）：");
            key = scanner.next();

            //使用switch分支控制

            switch (key){
                case"1":
                   this.detail();
                    break;

                case"2":
                    this.incom();
                        break;


                case"3":
                    this.pay();
                    break;


                case"4":
                   this.exit();
                    break;

                default:
                    System.out.println("选择有误，请重新选择");
            }

        } while (loop);
    }

    //2.完成零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //3.收益入账
    public void incom() {
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();

        //money的值范围应该校验
        //找出不正确的金额的条件，然后给出提示，直接return
        if (money <= 0) {
            System.out.println("收益金额需要大于0");
            return;//退出方法，不再执行后面的代码
        }

        balance += money;
        //拼接收益入账信息到details
        date = new Date();//获取当前日期
        details += "\n收益入账\t" + "+" + money + "\t" + sdf.format(date) + "\t" + balance;

    }


    //4.消费
    public void pay() {
        System.out.println("消费金额");
        money = scanner.nextDouble();

        //money的值范围应该校验
        if (money <= 0 || money > balance) {
            System.out.println("您的消费金额应该在0-" + balance);
            return;
        }
        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;
        //拼接消费信息到details
        date = new Date();//获取当前日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;

    }

    //5.退出
    public void exit() {
        System.out.println("4.退      出");
        //用户退出时“你确定退出吗？y/n”，必须输入正确的y/n

        String choice = "";
        while (true) {//要求用户必须输入y/n，否则就一直循环
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }

        //当用户退出while时，进行判断
        //*重点，用户输入y是退出零钱系统，用户输入n放弃然后返回应用的界面
        if (choice.equals("y")) {
            loop = false;
        }



    }


}
