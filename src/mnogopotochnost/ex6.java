package mnogopotochnost;

public class ex6 implements Runnable{
    @Override
    public void run() {
        System.out.println("run potok , Thread name = " + Thread.currentThread().getName() );
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ex6());
        thread.start();

        System.out.println("run potok main, Thread name = " + Thread.currentThread().getName() );
    }
}
