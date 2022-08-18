import java.util.HashMap;
import java.util.Map;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/23 - 12 - 23 - 13:56
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class Map01 {
    public static void main(String[] args) {

        //key,value

        Map map = new HashMap();
        map.put("no1", "韩顺平");
        map.put("no2", "张");
        map.put("no3", "曹");
        map.put("no2", "周芷若");
        map.put("no4", "赵");
        map.put("no5", "韩顺平");

        map.put(null,null);
        map.put(null,"abc");
        map.put("no6",null);
        map.put("no7",null);

        map.put(1,"殷素素");
        map.put(new Object(),"金毛狮王");



        System.out.println("map =" + map);

        System.out.println(map.get("no3"));
    }


}
