package com.zly.pisa;

import java.util.Scanner;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/8/13 - 08 - 13 - 17:00
 * @Description:
 * @version:1.0
 */
public class PizzaStore {
    public static Pizza getPizza(int choice) {
        Scanner sc = new Scanner(System.in);
        Pizza p = null;
        switch (choice) {
            case 1: {
                System.out.println("请录入培根披萨的克数：");
                int weight = sc.nextInt();

                System.out.println("请录入培根的尺寸大小");
                int size = sc.nextInt();

                System.out.println("请录入培根的价格");
                int price = sc.nextInt();

                //将录入的信息封装成培根披萨的对象
                BaconPizza bp = new BaconPizza("培根披萨", size, price, weight);
                p = bp;
            }
            break;

            case 2: {
                System.out.println("请录入你想加入的水果配料：");
                String burdening = sc.next();

                System.out.println("请录入水果披萨的尺寸大小");
                int size = sc.nextInt();

                System.out.println("请录入水果的价格");
                int price = sc.nextInt();

                //将录入的信息封装成水果披萨的对象
                FruitsPizza fp = new FruitsPizza("水果披萨", size, price, burdening);
                p = fp;
            }
            break;

        }

        return p;
    }
}
