package File;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/4 - 01 - 04 - 14:21
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class FileCreat {
    public static void main(String[] args) {
    }

    //方式一
    @Test
    public void creat01() {
        String filePath = "e:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式二
    @Test
    public void creat02() {
        File parentFile = new File("e:\\");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式三
    @Test
    public void creat03() {
        String parentPath = "e:\\";
        String fileName = "news3.txt";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


