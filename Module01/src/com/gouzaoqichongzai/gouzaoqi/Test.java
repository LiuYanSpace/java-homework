package com.gouzaoqichongzai.gouzaoqi;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/11 - 07 - 11 - 21:07
 * @Description:gouzaoqi
 * @version:1.0
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
    /*
    1.一般保证空构造器的存在，空构造器中一般不会进行属性的赋值操作
    2.一般我们会重载构造器，在重载构造器中进行赋值操作
    3.在重载构造器以后，空构造器忘写了，系统不会给你分配默认的空构造器
    4.
    */

        Person p = new Person();

        Person p2 = new Person("lili", 19, 169.5);
        System.out.println(p2.age);

        Person p3 = new Person("lilian", 18, 190.5);
        System.out.println(p3.age);

        p2.eat();


    }
}
