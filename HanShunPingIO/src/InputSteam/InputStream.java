package InputSteam;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/4 - 01 - 04 - 15:30
 * @Description:
 * @version:1.0
 */
public class InputStream {
    public static void main(String[] args) {

    }
//方式一
    @Test
    public void readFile01() {
        String filePath = "e:\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //方式二read(byte[] b)
    @Test
    public void readFile02() {
        String filePath = "e:\\hello.txt";

        //定义字节数组
        byte[] buf = new byte[8];

        int readLen = 0;

        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream
            fileInputStream = new FileInputStream(filePath);
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

