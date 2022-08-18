package Set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/22 - 12 - 22 - 16:15
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class Set01 {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add("tom");
        set.add("r");
        set.add("tom");
        set.add("e");
        set.add("y");
        set.add(null);
        set.add(null);

        System.out.println("set =  " + set);

        for (Object o : set) {
            System.out.println("o = " + o);

        }


    }
}
