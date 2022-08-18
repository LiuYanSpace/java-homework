package com.zly.pisa;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/8/13 - 08 - 13 - 16:21
 * @Description:
 * @version:1.0
 */
public class BaconPizza extends Pizza {
    //属性
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //构造器

    public BaconPizza() {
    }

    public BaconPizza(String name, int size, int price, int weight) {
        super(name, size, price);
        this.weight = weight;
    }
    //重写showPizza方法
    public String showPizza(){
        return super.showPizza()+"\n培根的克数是："+weight+"克";

    }

}
