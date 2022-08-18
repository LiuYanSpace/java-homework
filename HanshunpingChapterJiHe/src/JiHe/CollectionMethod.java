package JiHe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/20 - 12 - 20 - 20:04
 * @Description:
 * @version:1.0
 */

public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();

        //添加单个元素
        list.add("jake");
        list.add(1);
        list.add(true);
        list.add(3.0);


        System.out.println("list =" + list);

        //删除
        list.remove(0);
        list.remove(true);
        System.out.println("list =" + list);

        //contains查找元素是否存在
        System.out.println(list.contains(1));

        //获取元素个数size
        System.out.println(list.size());

        //判断是否为空isEmpty
        System.out.println(list.isEmpty());

        //clear清空
       //list.clear

        //添加多个元素addAll
        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("桑国演义");

        list.addAll(list2);

        System.out.println("list =" + list);




        //查找多个元素是否存在containsAll
        System.out.println(list.containsAll(list2));





        //删除多个元素removeAll
        list.add("聊斋");
        list.removeAll(list2);

        System.out.println("list =" + list);


    }
}
