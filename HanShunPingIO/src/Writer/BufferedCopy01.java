package Writer;

import Reader.BufferedReader;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/5 - 01 - 05 - 16:52
 * @Description:
 * @version:1.0
 */
public class BufferedCopy01 {
    public static void main(String[] args) {
        String srcFilePath = "e:\\HashSet01.java";
        String destFilePath = "e:\\HashSet02.java";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;

/*
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));

            //读取写入
            while ( (line = br.readLine()) != null) {
                //每读取一行就写入
                bw.write(line);
                //换行
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if(br != null){
                    br.close();
                }
                if(bw != null){
                    bw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

 */

    }
}
