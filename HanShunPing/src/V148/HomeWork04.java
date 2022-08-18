package V148;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/18 - 12 - 18 - 15:13
 * @Description:
 * @version:1.0
 */

//判断一个整数是否是水仙花数，所谓的水仙花数是指一个3位数，其各个位上数字立方和等于其本身。例如：153=1*1*1+3*3*3+5*5*5

public class HomeWork04 {
    public static void main(String[] args) {

        int n = 157;//取百位、十位、个位

        int b = 157 / 100;
        int s = 157 % 100 / 10;
        int g = 157 % 10;

        if(n == b*b*b + s*s*s + g*g*g){//注意==

            System.out.println("是");

        }else{

            System.out.println("否");
        }



    }
}
