package JiHeHomeWork;

import java.util.ArrayList;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/24 - 12 - 24 - 16:04
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class HomeWrk02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);

        arrayList.add(car);
        arrayList.add(car2);
        System.out.println(arrayList);

        arrayList.remove(car);

        System.out.println(arrayList.contains(car2));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        //arrayList.clear();

        //添加多个元素
        arrayList.addAll(arrayList);//2个宾利

        arrayList.containsAll(arrayList);

        //arrayList.removeAll(arrayList);

        for (Object o : arrayList) {
            System.out.println(o);
        }


    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
