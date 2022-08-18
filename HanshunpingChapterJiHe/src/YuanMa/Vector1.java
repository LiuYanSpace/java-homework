package YuanMa;

import java.util.Vector;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/21 - 12 - 21 - 21:30
 * @Description:
 * @version:1.0
 */
public class Vector1 {
    public static void main(String[] args) {

        Vector vector = new Vector();

        for (int i = 0; i < 10; i++) {

            vector.add(i);

        }

        vector.add(10);
        System.out.println(vector);

    }
}
