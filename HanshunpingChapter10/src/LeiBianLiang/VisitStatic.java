package LeiBianLiang;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/20 - 12 - 20 - 16:32
 * @Description:
 * @version:1.0
 */
public class VisitStatic {
    public static void main(String[] args) {

        //类名.类变量名
        //类变量是随着类的加载而创建，即使没有创建对象实例也可以访问
        System.out.println(A.name);

        //创建实例，通过对象名.类变量名a.name
        A a = new A();
        System.out.println("a.name = " + a.name);


    }
}

class A {
    //类变量
    //类变量的访问，必须遵守相关的访问权限
    public static String name = "韩顺平教育";

    private int num = 10;//实例变量、普通属性、普通成员变量、非静态属性、非静态成员变量

}
