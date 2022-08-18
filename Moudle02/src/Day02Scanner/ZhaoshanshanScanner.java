package Day02Scanner;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/11 - 07 - 11 - 13:47
 * @Description:Day30
 * @version:1.0
 */
public class ZhaoshanshanScanner {
    public static void main(String[] args) {
        //求圆的周长和面积
        //周长
        /* double c = 2 * 5 * 3.14;
            System.out.println("周长为："+c);
            double c2 = 2 * 5 * 3.1415926;
            System.out.println("周长为："+c2);

        //面积
        double s = 3.14 * 5 * 5;
            System.out.println("面积为："+s);

        */
        //提取变量:提取变量就是为了一劳永逸，以后只要改变变量的值，下面只要用到这个变量的地方，取值也都发生变化
        final double PI = 3.14;//final修饰，变量变成常量，值不可修改，这个常量就是字符常量----PI
        //约定俗成的规定：字符常量的名字全部大写
        int r = 8;
        //求周长
        double c = 2 * PI * r;
        System.out.println("周长为：" + c);

        //求面积
        double s = PI * r * r;
        System.out.println("面积为：" + s);
    }
}
