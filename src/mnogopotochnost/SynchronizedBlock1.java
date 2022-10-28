package mnogopotochnost;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRanvImp2 myRanvImp = new MyRanvImp2();
        Thread thread1 = new Thread(myRanvImp);
        Thread thread2 = new Thread(myRanvImp);
        Thread thread3 = new Thread(myRanvImp);
        thread1.setName("Первый поток");
        thread2.setName("Второй поток");
        thread3.setName("Третий поток");

        thread1.start();
        thread2.start();
        thread3.start();

    }

}

class Counter2 {
    static int count = 0;
}

class MyRanvImp2 implements Runnable {

    private void doWork2() {
        System.out.println("Yraaaaaaaaaaaa");
    }


    private void doWork1() {
        doWork2();
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }

    }
}