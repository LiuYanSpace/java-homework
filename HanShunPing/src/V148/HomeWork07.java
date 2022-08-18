package V148;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/18 - 12 - 18 - 15:25
 * @Description:
 * @version:1.0
 */
/*输出小写的a-z以及大写的Z-A
    1.'b' = 'a' + 1
    2.使用for
 */


public class HomeWork07 {
    public static void main(String[] args) {

        for (char c1 = 'a' ; c1 <='z' ; c1++){
            System.out.println(c1 + " ");
        }

        System.out.println("===============");

        for (char c2 = 'Z' ; c2 >='A' ; c2--){
            System.out.println(c2 + " ");
        }
    }
}
