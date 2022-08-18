package List;


import java.util.ArrayList;
import java.util.List;


/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/20 - 12 - 20 - 21:53
 * @Description:
 * @version:1.0
 */
public class List1 {
    public static void main(String[] args) {

        //List集合类中元素有序（即添加顺序和取出顺序一致），且可重复

        List list = new ArrayList();

        list.add("tom");
        list.add("rom");
        list.add("eom");
        list.add("tom");

        System.out.println("list =" + list);

        //索引
        System.out.println(list.get(3));
    }
}
