package Upload;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/6 - 01 - 06 - 17:03
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class TCPFileUploadClient {
    public static void main(String[] args) throws IOException {
       //连接到
        Socket socket = new Socket(InetAddress.getLocalHost() , 8888);
       //创建读取磁盘文件的输入流
        String filePath = "e:\\qie.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        
    }
}
