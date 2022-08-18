package P343;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/19 - 12 - 19 - 14:04
 * @Description:
 * @version:1.0
 */
public class Profess extends Teacher {
    public Profess(String name, int age, String post, double salar, double grade) {
        super(name, age, post, salar, grade);
    }

    @Override//重写的快捷键ctrl+o
    public void introduce() {
        System.out.println("这是教授的信息");
        super.introduce();
    }
}
