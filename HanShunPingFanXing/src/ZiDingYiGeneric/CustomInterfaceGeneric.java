package ZiDingYiGeneric;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/27 - 12 - 27 - 17:03
 * @Description:
 * @version:1.0
 */
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }

}
//在继承接口，指定泛型接口的类型
interface IA extends IUsb<String, Double>{

}
//实现IA接口时，因为IA继承IUsb接口时，指定了U为String,R为Double
class AA implements IA{//鼠标点在implements上method

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}
//继承接口
class BB implements IUsb<Integer, Float>{

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float floa) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}
//不指定类型就是Object
class CC implements IUsb{

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}
interface IUsb<U, R> {

    int n= 10;

    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    default R method(U u) {
        return null;
    }
}

