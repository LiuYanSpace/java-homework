import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/23 - 12 - 23 - 14:35
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class Map02 {
    public static void main(String[] args) {

        //key,value

        Map map = new HashMap();
        map.put("no1", "韩顺平");
        map.put("no2", "张");

        //System.out.println("map =" + map);

     /*
     1.k-v 最后是 HashMap$Node node = new Node(hash,key,vaule,null)

     2.k-v 为了方便程序员的遍历，还会创建 EntrySet集合

     3.EntrySet中，定义的类型是map.Entry,但实际上存放的还是hashMap$Node
       因为HashMap$Node implements Map.Entry
       为了方便遍历



      */

        Set set = map.entrySet();
        System.out.println(set.getClass());//entryset

        for (Object obj : set) {//hashMap$Node

            Map.Entry entry = (Map.Entry) obj;

            System.out.println(entry.getKey() +  "-" + entry.getValue());


        }


    }


}
