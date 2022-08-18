package com.daimakuai;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/13 - 07 - 13 - 16:48
 * @Description:daima
 * @version:1.0 一、类的组成：属性、方法、构造器、代码块、内部类
 * <p>
 * 二、代码块分类：普通块、构造块、静态块、同步块
 * <p>
 * 三、代码块执行顺序：
 * 1.最先执行静态块，只在类的加载的时候执行一次，所以一般以后实战写项目：创建工厂，数据库的初始化信息放入静态块
 * 一般用于执行一些全局性的初始化操作
 * 再执行构造块（不常用）
 * 再执行构造器
 * 再执行方法中的普通块
 */
public class Test {
    //属性
    int a;
    static int sa;

    //方法
    public void a() {
        System.out.println("------a");
        {
            System.out.println("这是普通块");
            //普通块限制了局部变量的作用
            System.out.println("------000000");
            int num = 10;
            System.out.println(num);
        }
        // System.out.println(num);

    }

    public static void b() {

        System.out.println("------b");

    }

    //构造块在方法外面
    {
        System.out.println("-------这是构造块");

    }

    //静态块
    static {
        System.out.println("这是静态块");
        //在静态块中只能访问静态属性和方法
        System.out.println(sa);
        b();
    }

    // 构造器
    public Test() {
        System.out.println("这是空构造器");

    }

    public Test(int a) {
        this.a = a;
    }

    //这是main方法，是程序的入口
    public static void main(String[] args) {
        Test t = new Test();
        t.a();

        Test t2 = new Test();
        t2.a();

    }

// 代码块


}

/*



 */
