package V148;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/18 - 12 - 18 - 15:24
 * @Description:
 * @version:1.0
 */
public class HomeWork05 {
    public static void main(String[] args) {

        /*求1+（1+2）+（1+2+3）+（1+2+3+4）+....+(1+2+3.....+100)
        1.一百项相加
        2.每一项的数字在逐渐增加

         */


        int sum = 0;

        for (int i = 1; i <= 100 ; i++){//可以表示第几项，同时也是当前项的最大的数

            for(int j = 1; j <= i ; j++){//内层循环对1-i进行循环

                 sum += j;

            }

        }
        System.out.println(sum);
    }
}
