package V148;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/18 - 12 - 18 - 15:26
 * @Description:
 * @version:1.0
 */
public class HomWeork08 {
    public static void main(String[] args) {
        /*求出1- 1/2 + 1/3 - 1/4 .... 1/100
        1.1/1 - 1/2 + 1/3 - 1/4 .....1/100
        2.分子是1，分母是1-100
        3.分母是偶数的时候前面是-，分母是奇数的时候+
         */

        double sum = 0;
        for (int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                sum += 1.0/i;//分子写成1.0才能得到精确的小数
            }else{
                sum -= 1.0/i;
            }
        }
        System.out.println("sum=" + sum);
    }
}
