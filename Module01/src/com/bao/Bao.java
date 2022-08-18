package com.bao;

import com.zly.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/*
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

以上可以变成
import java.util.*;
 */


/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/13 - 07 - 13 - 17:30
 * @Description:bao
 * @version:1.0 包名：
 * 1.名字小写
 * 2.中间用.隔开
 * 3.一般都是公司的域名倒着写：com.jd com.taobao
 * 4.加上模块名字：
 * com.jd.login  com.jd.register
 * 5.不能使用系统中的关键字：nul,con,com1---9....
 * 6.包的声明位置一般都是在非注释代码的第一行
 * <p>
 * 导包问题：
 * 1.使用不同包下的类需要导包：import
 * 2.在导包以后，还想用其他包下同名的类，就必须手动自己写所在的包
 * 3.同一包下的类想使用不需要导包，可以直接使用
 * 4.在java.lang包下的类，可以直接使用，无需导包：
 * System.out.println(Math.random());
 * 5.IDEA中导包快捷键：alt+enter
 * 6.可以直接导入
 * import java.util.*;
 * <p>
 * 导包没有包含与被包含的关系：设置目录的平级的格式
 * <p>
 * <p>
 * 静态导入问题：
 */
public class Bao {
    //这是个main方法，是程序的入口
    public static void main(String[] args) {
        new Person();
        new Date();
        new java.sql.Date(1000l);//在导包以后，还想用其他包下同名的类，就必须手动自己写所在的包

        //随机数
        System.out.println(Math.random());

        new ArrayList<>();
        new HashMap<>();
    }
}
