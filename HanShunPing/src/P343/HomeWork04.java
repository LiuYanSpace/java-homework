package P343;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/19 - 12 - 19 - 14:16
 * @Description:
 * @version:1.0
 */
public class HomeWork04 {
    public static void main(String[] args) {
     Manager m =  new Manager("刘",100,20,1.2);
//设置奖金
        m.setBonus(3000);
        m.printlnsalary();
    }
}
