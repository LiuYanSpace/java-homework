package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/6 - 01 - 06 - 16:04
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class Client02 {
    public static void main(String[] args) throws IOException {
        //1.连接服务端IP和端口
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket连接成功" + socket.getClass());

        //2.得到输出流
        OutputStream outputStream = socket.getOutputStream();

        //3.通过输出流写入数据

        outputStream.write("hello,server".getBytes());
        //设置结束标记
        socket.shutdownOutput();

        //4.得到输入流
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }

        //关闭流
        outputStream.close();
        inputStream.close();
        socket.close();


    }
}
