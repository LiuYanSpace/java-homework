package Set;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/22 - 12 - 22 - 17:44
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class HashSetStructure {
    public static void main(String[] args) {
        //数组+链表+红黑树

        //1.创建一个数组，数组的类型是Node[]
        //有些人把node数组成为表
        Node[] table = new Node[16];
        System.out.println("table =" + table);

        //2.创建结点
        //table索引为2的位置
        Node john = new Node("john", null);
        table[2] = john;

        Node jake = new Node("jake", null);
        john.next = jake;

        Node rose = new Node("rose", null);
        jake.next = rose;

        //索引为3的位置
        Node luce = new Node("luce", null);
        table[3] = luce;



        System.out.println("table =" + table);


    }
}

class Node {
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
