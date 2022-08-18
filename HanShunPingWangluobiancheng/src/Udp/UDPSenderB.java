package Udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/7 - 01 - 07 - 14:23
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9998);//同一台机器所以端号不同

        //封装
        byte[] data = "Hello,明天一起吃火锅".getBytes(StandardCharsets.UTF_8);

        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.3.4"), 9999);

        socket.send(packet);


        //构建一个
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);

        socket.receive(packet);

        //拆包

        int length = packet.getLength();//
        data = packet.getData();

        String s = new String(data, 0, length);

        System.out.println(s);

        //关闭
        socket.close();

    }
}
