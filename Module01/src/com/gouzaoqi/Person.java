package com.gouzaoqi;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/11 - 07 - 11 - 21:04
 * @Description:gouzaoqi
 * @version:1.0
 */
public class Person {
    //构造器：没有任何参数的构造器叫做空参构造器---》空构造器
    public Person(){
        age = 19;
        name = "lili";
        height = 169.5;


    }

    //属性
    String name;
    int age;
    double height;

    //方法
    public void eat() {
        System.out.println("我喜欢吃饭");
    }
}
