package OutputStream;

import java.io.*;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/5 - 01 - 05 - 17:27
 * @Description:
 * @version:1.0
 */
public class BufferedCopy02 {
    public static void main(String[] args) {

        String srcFilePath = "e:\\Koala.jpg";
        String destFilePath = "e:\\hsp.jpg";

        //创建
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            //读取文件并写入
            byte[] buff = new byte[1024];

            int readLen = 0;

            //当返回-1.文件读取完毕
            while ((readLen = bis.read(buff)) != 1){
                bos.write( buff, 0, readLen);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
             //关闭流，外层流关闭即可 w
            try {
                if(bis != null){
                    bis.close();
                }
                if(bos !=  null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
