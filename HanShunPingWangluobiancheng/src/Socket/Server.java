package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/6 - 01 - 06 - 15:36
 * @Description:
 * @version:1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听，等待连接");
        //
        Socket socket = serverSocket.accept();

        System.out.println(socket.getClass());

        InputStream inputStream = socket.getInputStream();

        //4.IO读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }

        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
