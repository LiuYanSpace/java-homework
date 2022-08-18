package Day02Scanner;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/11 - 07 - 11 - 15:45
 * @Description:Day30
 * @version:1.0
 */

import java.util.Scanner;

public class ZhaoshanshanScanner02 {
    public static void main(String[] args) {
        final double PI = 3.14;
        //拿来一个扫描器
        Scanner sc = new Scanner(System.in);
        //友好性的提示
        System.out.println("请录入半径：");
        //让扫描器扫描键盘录入的int类型的数据；
        int r = sc.nextInt();

        //求周长
        double c = 2 * PI * r;
        System.out.println("周长为：" + c);

        //求面积
        double s = PI * r * r;
        System.out.println("面积为：" + s);
    }

}
