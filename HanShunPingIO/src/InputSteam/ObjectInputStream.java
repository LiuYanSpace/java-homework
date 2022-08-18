package InputSteam;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/5 - 01 - 05 - 21:06
 * @Description:
 * @version:1.0
 */
public class ObjectInputStream {


    public ObjectInputStream(FileInputStream fileInputStream) {
    }

    public static void main(String[] args) throws IOException {
        String filePath = "e:\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //读取顺序和保存顺序要一致
/*
oos.writeInt(100);//int----Integer
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(9.5);
        oos.writeUTF("韩顺平");
        oos.writeObject(new Dog("小黄", 5));

        oos.close();

        System.out.println("数据保存成功，序列化成功");
 */
        ois.readInt();
        System.out.println( ois.readInt());
        //ois.readBoolean();
       // ois.readChar();
       // ois.readDouble();
       // ois.readUTF();
        //ois.readObject();

       // ois.close();

    }

    private int readInt() {
        return 0;
    }

}
