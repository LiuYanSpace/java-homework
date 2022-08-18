package com.zly.pisa;

import java.util.Scanner;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/8/13 - 08 - 13 - 16:24
 * @Description:
 * @version:1.0
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //选择购买的披萨
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择你想要购买的披萨（1.培根披萨 2.水果披萨）：");
        int choice = sc.nextInt();//选择

        //通过工厂获取披萨：
        Pizza pizza = PizzaStore.getPizza(choice);
        System.out.println(pizza.showPizza());

    }
}
