import java.io.Serializable;
import java.lang.invoke.SerializedLambda;

public class Main1 {


    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>();
        pair.setFirst("fir");
        pair.setSecond(12);

        Pair.get("t");
        Main1.<String>test(32);
        t();
    }
    public static void t() {}

    public static <T extends Comparable & Serializable> int test(int i) {
        return 1;
    }
}

class Pair<T, E> {
    T first;
    E second;
    public Pair() {}
    public Pair(T f, E s) {
        first = f;
        second = s;
    }
    public T getFirst() {
        return first;
    }
    public E getSecond() {
        return second;
    }
    public void setFirst(T f) {
        first = f;
    }
    public void setSecond(E s) {
        second = s;
    }
    public static <T> T get(T t) {
        return t;
    }
}