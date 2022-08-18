package JiHe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/20 - 12 - 20 - 21:34
 * @Description:
 * @version:1.0
 */
public class CollectionExercise {
    public static void main(String[] args) {
       Collection col = new ArrayList();

       col.add(new Dog("jk",10));
       col.add(new Dog("Mk",2));
       col.add(new Dog("tk",15));

        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj = " + obj);
        }

        for (Object o : col) {
            System.out.println("o = " + o);

        }


    }

}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

