package mnogopotochnost;

public class VolatileEx extends Thread{
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop is finished. counter : " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx volatileEx = new VolatileEx();
        volatileEx.start();
        Thread.sleep(3000);
        System.out.println("After 3sec pora vstavat!!!!");
        volatileEx.b = false;
        volatileEx.join();
        System.out.println("Konech progmammi");

    }
}
