package JiHe;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/20 - 12 - 20 - 21:27
 * @Description:
 * @version:1.0
 */
public class CollectionFor {
    public static void main(String[] args) {

     Collection col = new ArrayList();

     col.add(new Book("三国", "罗", 10.1));
     col.add(new Book("小丽", "古", 10.2));
     col.add(new Book("红楼", "薛", 10.1));


     //使用增强for循环(也直接可以用在数组上）快捷键I
     for(Object book : col){
      System.out.println("book = " +book);
     }
 }
}
