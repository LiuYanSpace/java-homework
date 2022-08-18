package File;

import java.io.File;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/4 - 01 - 04 - 14:54
 * @Description:
 * @version:1.0
 */
public class FileInformation {
    public static void main(String[] args) {

    }

    public void info(){
        //先创建文件
        File file = new File("e:\\new5.txt");
        System.out.println(file.getName());
    }
}
