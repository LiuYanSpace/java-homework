package Day02Scanner;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/10 - 07 - 10 - 21:54
 * @Description:Day30
 * @version:1.0
 */

import java.util.*;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请录入成本");
        int meal_Cost = sc.nextInt();
        System.out.println("请录入小费百分比：");
        int tip_Percent = sc.nextInt();
        System.out.println("请录入税收百分比：");
        int tax_Percent = sc.nextInt();

        double tip = meal_Cost * tip_Percent / 100;
        double tax = meal_Cost * tax_Percent / 100;
        int totalCost = (int) Math.round(meal_Cost + tax + tip);

        System.out.println("The total meal cost is " + totalCost + " dollars.");

    }

}
