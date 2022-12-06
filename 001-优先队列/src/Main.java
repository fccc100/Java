import java.util.ArrayList;
import java.util.PriorityQueue;

class P implements Comparable {
    private int id;

    public P(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        P p = (P) o;
        return this.id - p.id;
    }

    @Override
    public String toString() {
        return String.valueOf(this.id);
    }
}

public class Main {

    // 优先队列
    public static void main(String[] args) {
        // 优先队列使用堆实现，默认是最小堆，堆顶元素是最小的元素
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(4);
        pq.offer(6);
        pq.offer(45);
        pq.offer(3);
        pq.offer(1);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        System.out.println("-------------");

        // 自定义比较器, 两种写法
        // 1
//        PriorityQueue<Integer> pq1 = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
        // 2
        PriorityQueue<Integer> pq1 = new PriorityQueue<>((a, b) -> b - a);
        pq1.offer(4);
        pq1.offer(6);
        pq1.offer(45);
        pq1.offer(3);
        pq1.offer(1);
        while (!pq1.isEmpty()) {
            System.out.println(pq1.poll());
        }
        System.out.println("-------------");

        // 自定义类，实现Comparable接口，实现其中的compareTo方法
        PriorityQueue<P> pq2 = new PriorityQueue<>();
        pq2.offer(new P(1));
        pq2.offer(new P(5));
        pq2.offer(new P(3));
        pq2.offer(new P(56));
        pq2.offer(new P(9));
        while (!pq2.isEmpty()) {
            System.out.println(pq2.poll());
        }
        System.out.println("-------------");

        PriorityQueue<Integer> pq3 = new PriorityQueue<>();
        // 添加元素
        pq3.offer(5);
        pq3.offer(2);
        pq3.offer(52);
        // 查看堆顶元素

        System.out.println(pq3.peek()); // 2

        // 取出堆顶元素
        System.out.println(pq3.poll()); // 2

        // 查看队列是否为空
        System.out.println(pq3.isEmpty());
        // 查看元素个数
        System.out.println(pq3.size());

        // 查看是否包含元素
        System.out.println(pq3.contains(3));
        System.out.println(pq3.contains(52));

        // 清空队列
        pq3.clear();
        System.out.println(pq3.isEmpty());
        System.out.println("-------------");

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(45);
        arr.add(4);
        arr.add(56);
        arr.add(3);

        // 接收List参数直接转为优先队列
        PriorityQueue<Integer> pq4 = new PriorityQueue<>(arr);
        while (!pq4.isEmpty()) {
            System.out.println(pq4.poll());
        }
    }
}
