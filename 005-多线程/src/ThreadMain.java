public class ThreadMain {


    public static void main(String[] args) {

        T1 t1 = new T1();
        t1.start();

        T2 t2 = new T2();
        t2.run();

        T3 t3 = new T3();
        Thread t = new Thread(t3);
        t.start();
    }
}

class T1 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
class T2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
class T3 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}