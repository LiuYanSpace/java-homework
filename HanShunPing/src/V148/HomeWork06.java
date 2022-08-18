package V148;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/18 - 12 - 18 - 15:25
 * @Description:
 * @version:1.0
 */
/*输出1——100之间的不能被5整除的数，每5个一行
1.输出1——100的所有数
2.不被5整除
3.每5个一行，使用计数器

 */

public class HomeWork06 {
    public static void main(String[] args) {

        int count = 0;//统计输出的个数

       for (int i = 1; i <= 100; i++){
           if(i % 5 != 0){
               count++;
               System.out.println(i+" ");

               //判断，每满5个就输出一行
               if (count % 5 == 0){
                   System.out.println();
               }
           }
       }
    }
}
