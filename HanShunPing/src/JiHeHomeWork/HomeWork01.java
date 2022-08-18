package JiHeHomeWork;

import java.util.ArrayList;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/24 - 12 - 24 - 15:08
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class HomeWork01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        //新冠确诊病例超千万，数百万印度信徒赴恒河“圣浴”引民众担忧
        //男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生

        arrayList.add(new News("新冠确诊病例超千万，数百万印度信徒赴恒河“圣浴”引民众担忧"));
        arrayList.add(new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生"));

        System.out.println(arrayList);

        //倒序遍历
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            //System.out.println(arrayList.get(i));
            News news = (News) arrayList.get(i);
            System.out.println(procesHeadline(news.getHeadline()));
        }

    }
    //专门写一个方法
    public static String procesHeadline(String headline){
        if (headline == null){
            return "";
        }
        if(headline.length() > 15){
          return headline.substring(0,15) + "-----------";
        }else{
            return headline;
        }
    }
}

class News {
    private String headline;
    private String content;

    public News(String headline) {
        this.headline = headline;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News =" + headline;
    }
}
