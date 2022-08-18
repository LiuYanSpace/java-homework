package V148;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/17 - 12 - 17 - 21:47
 * @Description:
 * @version:1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {

        double Money = 100000;
        int count = 0;

       while(true){
           if(Money > 50000) {

               //Money = Money-Money*5%
               Money *= 0.95;
               count++;

           }else if(Money >= 1000 ){

               //Money = Money - 1000;
               Money -= 1000;
               count++;
           }else{
               break;
           }

       }

        System.out.println(Money + "可以过" + count +"路口");
    }

}
