package Udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/7 - 01 - 07 - 14:22
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class UDPReceiverA {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(9999);

        //构建一个
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        socket.receive(packet);

        //拆包

        int length = packet.getLength();//
        byte[] data = packet.getData();

        String s = new String(data, 0, length);

        System.out.println(s);


        //封装
        data = "好的，明天见".getBytes(StandardCharsets.UTF_8);

        packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.3.4"), 9998);

        socket.send(packet);


        //关闭
        socket.close();


    }
}
