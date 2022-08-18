package com.zly;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/6 - 07 - 06 - 9:23
 * @Description:com.zly
 * @version:1.0
 */
public class Person {
    //名词：属性---成员变量----放在类中方法外（注意：只把有需要的内容的写到代码里。不相关的的东西不要放在代码里）
    int age;
    String name;
    double height;
    double weight;

    // 动词：方法
    //吃饭
    public void eat() {
        int num = 10;//局部变量：放在方法中
        System.out.println("我喜欢吃饭");
    }

    //睡觉
    public void sleep(String address) {
        System.out.println("我在" + address + "睡觉");
    }

    //自我介绍
    public String introduce() {
        return "我的名字：" + name + ",我的年龄是：" + age + ",我的身高是：" + height + ",我的体重是：" + weight;
    }
}
