package FanXingGeneric01;

import java.util.ArrayList;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/24 - 12 - 24 - 19:20
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class Generic01 {
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("来财", 1));
        arrayList.add(new Dog("大黄", 5));
        //arrayList.add(new Cat("招财猫", 10));

        for (Dog dog : arrayList) {
            System.out.println(dog.getName() + "------" +dog.getAge());
        }

    }
}

class Dog {
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
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
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