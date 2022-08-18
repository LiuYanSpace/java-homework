package List;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/20 - 12 - 20 - 22:04
 * @Description:
 * @version:1.0
 */
public class ListMethod {
    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("tom");
        list.add("rom");
        list.add("eom");

        //1.插入一个元素
        list.add(1,"贾宝玉");
        System.out.println("list =" +list);

        List list2 = new ArrayList<>();
        list2.add("t");
        list2.add("r");
        list2.add("e");
        list.addAll(1,list2);
        System.out.println("list =" +list);

        System.out.println(list.indexOf("tom"));
        System.out.println(list.lastIndexOf("t"));

        list.remove(0);

        list.set(1,"马丽");

       // List returnlist =

    }
}
