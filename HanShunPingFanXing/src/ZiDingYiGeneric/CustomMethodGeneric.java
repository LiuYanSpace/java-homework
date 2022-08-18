package ZiDingYiGeneric;

import java.util.ArrayList;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/27 - 12 - 27 - 17:32
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马", 100);
        car.fly(300, 100);

        //T---String,R---ArrayList
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(), 11.3f);
    }
}

class Car {
    public void run() {//普通方法

    }

    // 1.<T , R>就是泛型
// 2.给fly使用
    public <T, R> void fly(T t, R r) {//泛型方法
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}

class Fish<T, R> {//泛型类

    public void run() {

    }

    public <U, M> void fly(U u, M m) {//泛型方法

    }

    //hi不是泛型方法，是使用了类声明的泛型
    public void hi(T t) {

    }
    //泛型方法可以使用类声明的泛型，也可以使用自己声明泛型

    public <K> void hello(R r, K k) {

        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }
}