package List;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/22 - 12 - 22 - 14:50
 * @Description:
 * @version:1.0
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jake = new Node("jake");
        Node mary = new Node("mary");
        Node ke = new Node("ke");

        //连接三个结点，形成双向链表
        jake.next = mary;
        mary.next = ke;

        ke.pre = mary;
        mary.pre = jake;

        Node first = jake;
        Node last = ke;

        //从头到尾遍历
        while (true) {
            if (first == null) {
                break;
            }
            //输出first的信息
            System.out.println(first);
            first = first.next;
        }

        //插入元素
        Node si = new Node("si");
        si.next = ke;
        si.pre = mary;
        mary.next = si;
        ke.pre = si;

        System.out.println("================");

        first = jake;

        while (true) {
            if (first == null) {
                break;
            }
            //输出first的信息
            System.out.println(first);
            first = first.next;
        }


    }
}

//定义一个node类，表示双向链表的一个结点
class Node {
    public Object item;//真正存放数据的地方
    public Node next;//指向下一个结点
    public Node pre;//指向前一个结点

    public Node(Object name) {
        this.item = name;
    }

    public String toString() {
        return "Node name=" + item;
    }
}
