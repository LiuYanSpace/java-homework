package Upload;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/6 - 01 - 06 - 17:03
 * @Description:
 * @version:1.0
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws IOException {

        //服务端监听8888
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
    }
}
