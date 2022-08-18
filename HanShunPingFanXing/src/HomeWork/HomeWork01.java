package HomeWork;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/27 - 12 - 27 - 18:18
 * @Description:
 * @version:1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {

    }

    @Test
    public void testList() {
        DAO<User> dao = new DAO<>();

        dao.save("001", new User(1, 10, "jake"));
        dao.save("001", new User(2, 18, "king"));
        dao.save("001", new User(3, 38, "smith"));

        List<User> list = dao.list();
        System.out.println(list);

        dao.update("003",new User(3,10,"milan"));
        System.out.println(dao.get("003"));
    }
}
