package Set;


import java.util.Set;
import java.util.HashSet;


/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/22 - 12 - 22 - 17:09
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
     /*源码：
     public HashSet() {
        map = new HashMap<>();
    }
      */
        //只能有一个null，不能有重复的元素
        //hashSet.add(null);
        // hashSet.add(null);

        //不保证存放和取出元素的顺序一样


        System.out.println(hashSet.add("eeeee"));
        System.out.println(hashSet.add("aaaaa"));
        System.out.println(hashSet.add("eeeee"));//false
        System.out.println(hashSet.add("rrrrr"));
        System.out.println(hashSet.add("yyyyy"));
        System.out.println(hashSet.add("uuuuu"));

        hashSet.remove("eeeee");
        System.out.println(" hashSet = " + hashSet);

        //重点：

        hashSet = new HashSet();
        hashSet.add("tom");//添加成功
        hashSet.add("tom");//添加失败

        hashSet.add(new Dog("om"));//添加成功
        hashSet.add(new Dog("om"));//添加成功

        hashSet.add(new String("m"));//OK
        hashSet.add(new String("m"));//false

        System.out.println(" hashSet = " + hashSet);

    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
