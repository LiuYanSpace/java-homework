package Day02Scanner;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/7/11 - 07 - 11 - 16:01
 * @Description:Day30
 * @version:1.0
 */

import java.util.Scanner;

public class ZhaoshanshanScanner03 {
    public static void main(String[] args) {
        //键盘录入学生的信息：年龄、身高、姓名、性别
        //键盘录入年龄int型数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        //double型数据
        System.out.println("请输入身高：");
        double height = sc.nextDouble();

        //String型数据
        System.out.println("请输入姓名：");
        String name = sc.next();

        //char型数据
        System.out.println("请输入性别：");
        String sexStr = sc.next();//字符串型数据
        char sex = sexStr.charAt(0);
        //上面两句话合成一句： char sex = sc.next().charAt(0)
        System.out.println("该学生的信息为：姓名是：" + name + ",年龄是：" + age + ",身高是：" + height + ",性别是：" + sex);
    }
}
