package LeiBianLiang;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/20 - 12 - 20 - 15:56
 * @Description:
 * @version:1.0
 */
public class ChildGame {
    public static void main(String[] args) {


        Child child1 = new Child("呜呜");
        child1.join();
        child1.count++;

        Child child2 = new Child("运营");
        child2.join();
        child2.count++;

        Child child3 = new Child("手术");
        child3.join();
        child3.count++;


                                 //类变量可以通过类名来访问
        System.out.println("共有" + Child.count +"个小孩加入了游戏");

        System.out.println("child1.count=" + child1.count);
        System.out.println("child2.count=" + child2.count);
        System.out.println("child3.count=" + child3.count);

    }
}

class Child {
    private String name;
    //定义一个变量count，是一个类变量（静态变量）static
    //该变量的最大特点就是会被child类的所有对象实例共享
    public static int count = 0;


    public Child(String name){
        this.name = name;
    }


    public void join(){
        System.out.println(name + "加入了游戏-------");
    }

}