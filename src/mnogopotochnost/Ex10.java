package mnogopotochnost;

public class Ex10 {
    public static void main(String[] args) {
        MyRanvImp myRanvImp = new MyRanvImp();
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

class Counter{
    static int count = 0;
}

class MyRanvImp implements  Runnable{

    public synchronized void  incr(){
        Counter.count++;
        System.out.print(Counter.count + " ");

    }

    @Override
    public void run() {
        for (int i = 0 ; i < 3 ; i++){
            incr();
        }
        System.out.println(Thread.currentThread().getName());
    }
}