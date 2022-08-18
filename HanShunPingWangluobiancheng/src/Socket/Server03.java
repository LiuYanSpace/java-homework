package Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/6 - 01 - 06 - 16:28
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class Server03 {
    public static void main(String[] args) throws IOException {
        //
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听，等待连接");
        //
        Socket socket = serverSocket.accept();
        System.out.println(socket.getClass());

        InputStream inputStream = socket.getInputStream();

        //4.IO读取，使用字符流读取

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        //5.输出流
        OutputStream outputStream = socket.getOutputStream();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client字符流");
        bufferedWriter.newLine();//插入换行符，表示写入内容结束。要求对方使用readLine来读取
        bufferedWriter.flush();//使用字符流，需要手动刷新


        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        serverSocket.close();
    }
}
