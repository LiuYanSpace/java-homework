package com.zly;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/6 - 07 - 06 - 9:40
 * @Description:com.zly
 * @version:1.0
 */
public class Test1 {//测试类

    // 这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建一个人类的具体的对象,对象的名字叫：zhangsan
        //Person属于引用数据类型
        //第一次加载类的时候，有默认的初始化值
        Person zhangsan = new Person();
        zhangsan.name = "张三";
        zhangsan.age = 19;
        zhangsan.height = 180.4;
        zhangsan.weight = 170.4;

        //再创建对象时，就不会进行类的加载
        Person ls = new Person();
        ls.name = "李四";

        //对属性值进行读取
        System.out.println(zhangsan.name);

        //对方法进行操作
        //不同的对象，属性有自己的特有的值，但是方法都是调用类中通用的方法
        //属性：各个对象的属性是独立的，各个对象的方法是共享的

        zhangsan.eat();
        ls.eat();

    }
}
