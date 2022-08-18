package ZiDingYiGeneric;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/27 - 12 - 27 - 15:01
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class CustomGeneric01 {
    public static void main(String[] args) {

    }
}
class Tiger<T, R, M>{
    String name;
    R r;
    T t;
    M m;
    //不允许实例化 ，因为无法确定T的类型。T[] ts = new T[8];

    public Tiger(String name, R r, T t, M m) {
        this.name = name;
        this.r = r;
        this.t = t;
        this.m = m;
    }
    //

   //不允许静态方法使用静态方法
    // public static void  m1(M m){}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}