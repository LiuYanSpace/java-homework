package com.zly;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/6 - 07 - 06 - 10:15
 * @Description:com.zly
 * @version:1.0
 */
public class Student {
    int c;//成员变量，在类中方法外.有初始值
    byte e;
    char ch;
    short sh;
    long num2;
    float f;
    double d;
    boolean bo;
    String name;

    public void student() {
        int num;//局部变量：在方法中
        //System.out.println(num);无法输出。未初始化变量num，没有初始值
        //int num;重复命名，出错
        {
            int a;//局部变量，在代码块中
        }
        if (1 == 3) {
            int b;
        }
        System.out.println(c);
    }

    //
    public void eat() {
        System.out.println(c);
    }

    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.c);
        System.out.println(s.e);
        System.out.println(s.ch);
        System.out.println(s.sh);
        System.out.println(s.num2);
        System.out.println(s.d);
        System.out.println(s.f);
        System.out.println(s.bo);
        System.out.println(s.name);
    }
}
