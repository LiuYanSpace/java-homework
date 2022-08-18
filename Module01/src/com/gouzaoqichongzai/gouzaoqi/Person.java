package com.gouzaoqichongzai.gouzaoqi;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/11 - 07 - 11 - 21:04
 * @Description:gouzaoqi
 * @version:1.0
 */
//构造器的重载

public class Person {
    //属性
    String name;
    int age;
    double height;

    //构造器：没有任何参数的构造器叫做空参构造器---》空构造器
    public Person() {

    }

    public Person(String name, int age, double height) {
        /*当形参名字和属性名字重名的时候，会出现就近原则：
        name = name;
        age =age;
        height = height;
*/
        //this代表创造的对象的属性进行赋值
        this.name = name;
        this.age = age;
        //this.height height;
    }

    //方法
    public void eat() {
        System.out.println("我喜欢吃饭");
    }
}
