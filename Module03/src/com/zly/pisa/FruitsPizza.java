package com.zly.pisa;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/8/13 - 08 - 13 - 16:16
 * @Description:
 * @version:1.0
 */
public class FruitsPizza extends Pizza {
    //属性：
    private String burdening;//配料

    public String getBurdening() {
        return burdening;
    }

    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }


    //构造器

    public FruitsPizza() {
    }
    public FruitsPizza(String name, int size, int price, String burdening) {
        super(name, size, price);
        this.burdening = burdening;
    }

    //重写父类的showPizza

    @Override
    public String showPizza() {
        return super.showPizza()+"\n你要加入的水果配料是："+burdening;
    }
}
