package OutputStream;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/4 - 01 - 04 - 16:02
 * @Description:
 * @version:1.0
 */
public class OutputStream01 {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile() {
        //创建OutputStream
        String filePath = "e:\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {

            fileOutputStream = new FileOutputStream(filePath);
        //写入一个字节
            fileOutputStream.write('h');
        //写入一个字符串
            String s = "hello,world";
            //s.getBytes可以把字符串变成字节数组
            fileOutputStream.write(s.getBytes(StandardCharsets.UTF_8));
           //
            fileOutputStream.write(s.getBytes(StandardCharsets.UTF_8), 0, 3);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
