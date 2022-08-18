package FanXingGeneric01;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/25 - 12 - 25 - 15:22
 * @Description:
 * @version:1.0
 */
public class Generic03 {
    public static void main(String[] args) {
        person<String> person = new person<String>("韩顺平");


    }
}
class person<E>{
    E name;//该数据类型在定义person对象的时候指定

    public person(E name) {
        this.name = name;
    }
}