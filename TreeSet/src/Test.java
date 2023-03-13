import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Test.m();

        Test t = new Test();
        t.m();
        t.m1();

        t = null;
        t.m();
        List<Integer> list = new ArrayList<>(19);

        System.out.println(list.size());
    }

    public static void m() {
        System.out.println("m");
    }

    public void m1() {
        System.out.println("m1");
    }
}
