package JiHeHomeWork;

import java.util.*;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/24 - 12 - 24 - 18:47
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class HomeWrk03 {
    public static void main(String[] args) {
        Map m = new HashMap();

        m.put("jake", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);
        System.out.println(m);

        m.put("jake", 2600);

        Set keySet = m.keySet();
        for (Object key : keySet) {

            m.put(key, (Integer)m.get(key) + 100);
            System.out.println(m);

        }

        Set entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "-------" + entry.getValue());
        }

        Collection values = m.values();
        for (Object value : values) {
            System.out.println(value);
        }


    }
}

