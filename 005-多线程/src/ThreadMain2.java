public class ThreadMain2 {
    public static void main(String[] args) {

        T t = new T();
        // 新建状态 New , 创建了一个新线程但是还没有运行
        Thread thread = new Thread(t);

        // 可运行状态 Runnable，调用了start方法之后，线程可能在运行状态也可能没有运行
        thread.start();
    }
}

class T implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
