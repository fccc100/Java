import java.util.*;

public class Collection_main {

    // 集合类分为Collection接口和Map接口
    public static void main(String[] args) {
        // Collection接口有Queue、List、Set子接口
        // Queue接口下有优先队列PriorityQueue实现类和双端队列Deque接口
        // Deque接口有LinkedList和ArrayDeque两个实现类，分别使用链表和数组实现
        testDeque();

        // List接口下有ArrayList和LinkedList两个实现类
        testList();
        System.out.println("-----");

        // Set接口下有HashSet和TreeSet实现类
        testSet();
    }

    private static void testSet() {
        // 哈希集合，无序的
        HashSet<Integer> set = new HashSet<>();
        set.add(456);
        set.add(7);
        set.add(23);
        set.add(2);
        set.add(56);
        for (Integer e : set) {
            System.out.println(e);
        }
        System.out.println(set);

        // 集合中是否存在元素
        System.out.println(set.contains(7));

        // 删除元素
        set.remove(2);
        System.out.println(set);

        System.out.println("-----");

        // TreeSet是有序的
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(456);
        set1.add(7);
        set1.add(23);
        set1.add(2);
        set1.add(56);
        set1.add(5);
        set1.add(563);
        set1.add(5);
        set1.add(5623);
        set1.add(6);
        set1.add(536);
        System.out.println(set1);
        for (Integer e : set1) {
            System.out.println(e);
        }

    }

    private static void testList() {
        ArrayList<Integer> arr = new ArrayList<>();
        // 添加元素
        arr.add(4);
        arr.add(2);
        arr.add(13);
        arr.add(7);
        arr.add(8);
        arr.add(6);
        System.out.println(arr);

        // 子列表，返回[l, r)区间的子列表
        System.out.println(arr.subList(2, 4));
        System.out.println(arr);

        // 删除索引位置元素
        arr.remove(2);
        System.out.println(arr);

        // 设置索引位置元素
        arr.set(2, 17);
        System.out.println(arr);

        // 索引位置添加元素
        arr.add(2, 77);
        System.out.println(arr);
//        arr.addFirst(3);
//        arr.addLast(3);
//        arr.getFirst();
//        arr.getLast();
//        arr.removeFirst();
//        arr.removeLast();

        // 链表实现的列表操作头尾节点是容易的，因此增加了addFirst、addLast、getFirst、getLast、removeFirst、removeLast六个操作头尾节点的方法
        LinkedList<Integer> arr1 = new LinkedList<>();
        arr1.addFirst(3);
        arr1.addLast(3);
        arr1.getFirst();
        arr1.getLast();
        arr1.removeFirst();
        arr1.removeLast();
    }

    private static void testDeque() {
        Deque<Integer> dq = new ArrayDeque<>();
        // 从队列尾部入队
        dq.offerLast(4);
        dq.offerLast(8);
        dq.offerLast(3);
        System.out.println(dq);
        // 从队列头入队
        dq.offerFirst(20);
        dq.offerFirst(7);
        System.out.println(dq);

        // 从队列尾出队
        System.out.println(dq.pollLast());
        // 从队列头出队
        System.out.println(dq.pollFirst());

        // 查看队列尾元素
        System.out.println(dq.peekLast());
        // 查看队列头元素
        System.out.println(dq.peekFirst());

        // 是否包含元素
        System.out.println(dq.contains(4));

        // 链表实现双端队列
        Deque<Integer> dq1 = new LinkedList<>();
    }
}
