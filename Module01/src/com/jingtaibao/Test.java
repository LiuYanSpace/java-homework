package com.jingtaibao;

import static java.lang.Math.*;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/29 - 07 - 29 - 11:10
 * @Description:jingtaibao
 * @version:1.0
 */
public class Test {
    /*第一种写法不导包
      public static void main(String[] args) {
      System.out.println(Math.random());
      System.out.println(Math.PI);
      System.out.println(Math.round(5.6));
    */


    //第二种写法导包：import static java.lang.Math.*;
    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(PI);
        System.out.println(round(5.6));

      /*在静态导入后，同一个类中有相同的方法的时候，会优先走自己定义的方法
      public static int round(double a){
       return 1000;
      }
       */

    }
}
