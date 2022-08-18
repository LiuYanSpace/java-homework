package HomeWork;

import java.util.*;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/27 - 12 - 27 - 18:23
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(map.get(key));//或者 list.add(get(key));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);

    }

    public void save(String id, T entity) {
        map.put(id, entity);
    }
}
