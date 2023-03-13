import java.util.TreeSet;

public class SortedList {
    public static void main(String[] args) {
        // 有序集合，加入的元素可以按自定义比较器进行排序
        TreeSet<Integer> set = new TreeSet<>();

        set.add(43);
        set.add(4);
        set.add(2);
        set.add(83);
        set.add(53);
        set.add(1);
        set.add(102);

        for (Integer n : set) {
            System.out.println(n);
        }
        // lower : 比指定值小的最大元素
        System.out.println("-------");
        System.out.println(set.lower(0));
        System.out.println(set.floor(43));


    }
}
