package mnogopotochnost;

public class Ex12 {
  static final Object lock = new Object();



    void mobileColl() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call end");
        }
    }

    void skypeColl() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call end");
        }
    }

    void whatsappColl() {
        synchronized (lock) {
            System.out.println("Whatsapp call starts");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Whatsapp call end");
        }
    }
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableleImpMobile());
        Thread thread2 = new Thread(new RunnableleImpSkype());
        Thread thread3 = new Thread(new RunnableleImpWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();
    }

}


class RunnableleImpMobile implements Runnable {

    @Override
    public void run() {
        new Ex12().mobileColl();
    }
}

class RunnableleImpSkype implements Runnable {

    @Override
    public void run() {
        new Ex12().skypeColl();
    }
}

class RunnableleImpWhatsapp implements Runnable {

    @Override
    public void run() {
        new Ex12().whatsappColl();
    }
}


class Car{}