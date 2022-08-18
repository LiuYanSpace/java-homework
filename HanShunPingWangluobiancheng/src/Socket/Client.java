package Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/6 - 01 - 06 - 15:40
 * @Description:
 * @version:1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //1.连接服务端IP和端口
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket连接成功" + socket.getClass());

        //2.得到输出流
        OutputStream outputStream = socket.getOutputStream();

        //3.通过输出流写入数据

        outputStream.write("hello,server".getBytes());


        //关闭流
        outputStream.close();
        socket.close();


    }
}
