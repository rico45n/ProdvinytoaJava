package mnogopotochnost;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}


class Thread10 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread10 : попытка захватить монитор обьекта Lock1");
        synchronized (DeadLockEx.lock1){
            System.out.println("Thread10 : захватил монитор обьекта Lock1");
            System.out.println("Thread10 : попытка захватить монитор обьекта Lock2");
            synchronized (DeadLockEx.lock2){
                System.out.println("Thread10 : захватил мониторы обьекта Lock1 и Lock2");
            }
        }
    }
}


class Thread20 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread20 : попытка захватить монитор обьекта Lock2");
        synchronized (DeadLockEx.lock1){
            System.out.println("Thread20 : захватил монитор обьекта Lock2");
            System.out.println("Thread20 : попытка захватить монитор обьекта Lock1");
            synchronized (DeadLockEx.lock2){
                System.out.println("Thread20 : захватил мониторы обьекта Lock2 и Lock1");
            }
        }
    }
}