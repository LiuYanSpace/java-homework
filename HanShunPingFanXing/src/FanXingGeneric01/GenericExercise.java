package FanXingGeneric01;

import java.util.*;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/26 - 12 - 26 - 19:42
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class GenericExercise {
    public static void main(String[] args) {

        //hashset
        HashSet<Sudent> sudents = new HashSet<>();
        sudents.add(new Sudent("jake", 18));
        sudents.add(new Sudent("tom", 28));
        sudents.add(new Sudent("mary", 19));

        for (Object student : sudents) {
            System.out.println(student);
        }

        //hashmap
        HashMap<String, Sudent> hm = new HashMap<String, Sudent>();
        hm.put("milan", new Sudent("milan", 38));
        hm.put("smith", new Sudent("smith", 48));
        hm.put("hsp", new Sudent("hsp", 28));
        //entry
        Set<Map.Entry<String, Sudent>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Sudent>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Sudent> next =  iterator.next();
            System.out.println(next.getKey() +"-----" +next.getValue());

        }
    }
}

class Sudent {
    private String name;
    private int age;

    public Sudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}