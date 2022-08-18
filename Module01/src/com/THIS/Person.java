package com.THIS;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/12 - 07 - 12 - 10:30
 * @Description:THIS
 * @version:1.0
 */

public class Person {
    //属性
    String name;
    int age;
    double height;

    //构造器：没有任何参数的构造器叫做空参构造器---》空构造器
    public Person() {

    }

    //有参构造器
    public Person(String a, int b, double c) {
        name = a;
        age = b;
        height = c;
    }

    //方法
    public void eat() {
        int age = 10;//就近原则，age指的是离它近的age，局部变量的age
        System.out.println(age);
        System.out.println(this.age);//想输出属性的值19
        System.out.println("我喜欢吃饭");
    }
}