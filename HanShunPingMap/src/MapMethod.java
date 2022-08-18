import java.util.*;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/23 - 12 - 23 - 15:05
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class MapMethod {
    public static void main(String[] args) {
    //常用方法
        Map map = new HashMap();
        map.put("no1", "韩顺平");
        map.put("no2", "张");
        map.put("no3", "曹");
        map.put("no4", "赵");
        map.put("no5", "平");
        System.out.println("map =" + map);

        //1.先取出所有的key
        Set keyset = map.keySet();
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }

        System.out.println("=================第二种方式=========");
        //2.迭代器
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-" + map.get(key));
        }



        System.out.println("=================第三种方式=========");
        //3.先取出所有的vaule
        Collection vaules = map.values();
        //Collection遍历
        for (Object vaule : vaules) {
            System.out.println(vaule);
        }

        Iterator  iterator1 = vaules.iterator();
        while (iterator1.hasNext()) {
            Object value =  iterator1.next();
            System.out.println("value = " + value);
        }

        //entyry

        Set entrySet = map.entrySet();
        //（1）
        for (Object entry : entrySet) {
            //将entry转成Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }

        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry =  iterator2.next();
            System.out.println(entry.getClass());
            //向下转型
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }

    }
}
