package Socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/6 - 01 - 06 - 16:28
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class Client03 {
    public static void main(String[] args) throws IOException {
        //1.连接服务端IP和端口
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket连接成功" + socket.getClass());

        //2.得到输出流
        OutputStream outputStream = socket.getOutputStream();

        //3.通过字符流写入数据
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server字符流");
        bufferedWriter.newLine();//插入换行符，表示写入内容结束。要求对方使用readLine来读取
        bufferedWriter.flush();//使用字符流，需要手动刷新


        //4.得到输入流
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        //关闭流
        bufferedReader.close();
        bufferedWriter.close();

        socket.close();


    }
}
