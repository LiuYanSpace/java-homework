package FanXingGeneric01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/27 - 12 - 27 - 13:12
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class GenericDetail {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        //List<int> list2 = new ArrayList<int>();

        //2.E指定了A类型，构造器传入了new A()
        Pig<A> aPig = new Pig<A>(new A());
        Pig<A> aPig1 = new Pig<A>(new B());

        //3.
        List<Integer> list1 = new ArrayList<>();

        //4.泛型默认是object
        ArrayList arrayList = new ArrayList();//等于ArrayList<Object> arrayList = new ArrayList();


    }
}
class A{

}
class B extends A{

}
class Pig <E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }
}