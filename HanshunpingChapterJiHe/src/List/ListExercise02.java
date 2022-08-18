package List;


import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/21 - 12 - 21 - 17:41
 * @Description:
 * @version:1.0
 */
public class ListExercise02 {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(new book("红",100,"曹雪芹"));
        list.add(new book("三",800,"施耐庵"));
        list.add(new book("西红",40.0,"吴芹"));
        list.add(new book("水",600,"学"));
        //list.add(new book("西红",40,"吴芹"));

        for (Object o :list) {
            System.out.println(o);

        }

        //如何对一个集合进行排序



    }
}

class book {
    private String name;
    private double price;
    private String author;

    public book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称：" + name +"\t\t价格：" +price + "\t\t作者：" +author;
    }
}
