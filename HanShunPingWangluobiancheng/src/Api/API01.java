package Api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/6 - 01 - 06 - 14:51
 * @Description:
 * @version:1.0
 */
public class API01 {
    public static void main(String[] args) throws UnknownHostException {

        //1.获取本机的InetAddress
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        //USER-20181031DW/192.168.3.4


        //2.
        InetAddress host01 = InetAddress.getByName("USER-20181031DW");
        System.out.println(host01);

        //3.根据域名返回InetAddress 比如www.baidu.com
        InetAddress host02 = InetAddress.getByName("www.baidu.com");
        System.out.println(host02);

        //4.
        host02.getHostAddress();
        host02.getHostName();

    }
}
