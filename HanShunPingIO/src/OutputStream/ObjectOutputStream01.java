package OutputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/5 - 01 - 05 - 20:53
 * @Description:
 * @version:1.0
 */
public class ObjectOutputStream01 {
    public static void main(String[] args) throws Exception{
        String filePath = "e:\\data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

         //
        oos.writeInt(100);//int----Integer
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(9.5);
        oos.writeUTF("韩顺平");
        oos.writeObject(new Dog("小黄", 5));

        oos.close();

        System.out.println("数据保存成功，序列化成功");
    }
}

class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
