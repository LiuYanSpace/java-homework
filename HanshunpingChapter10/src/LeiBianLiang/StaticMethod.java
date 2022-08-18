package LeiBianLiang;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/20 - 12 - 20 - 17:07
 * @Description:
 * @version:1.0
 */
public class StaticMethod {
    public static void main(String[] args) {

        Stu a = new Stu("tom");
        a.payFee(100);//或者可以写成 Stu.payFee(100);

        Stu b = new Stu("mary");
        b.payFee(200);//或者可以写成 Stu.payFee(200);


        //总学费：
        Stu.showFee();

    }
}

class Stu {
    private String name;

    public static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    //静态方法访问静态属性
    public static void payFee(double fee) {

        Stu.fee += fee;
    }

    public static void showFee() {

        System.out.println("总学费有：" + Stu.fee);

    }
}