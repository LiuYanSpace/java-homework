package JiHe;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/20 - 12 - 20 - 21:06
 * @Description:
 * @version:1.0
 */
public class CollectionIterator {
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book("三国", "罗", 10.1));
        col.add(new Book("小丽", "古", 10.2));
        col.add(new Book("红楼", "薛", 10.1));

        System.out.println("col = " + col);

        //遍历集合

        //1.先得到col对应的迭代器
        Iterator iterator = col.iterator();

        //2.使用while循环遍历,(快捷键itit回车.)
        while (iterator.hasNext()){//判断是否还有数据
            Object obj = iterator.next();
            System.out.println("obj= " + obj);
        }

        //3.当退出while循环后，迭代器指向最后的元素

        //如果想再次遍历，需要重置迭代器
        iterator = col.iterator();
        System.out.println("第二次遍历");
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj =" + obj);
        }


    }
}

class Book {

    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

