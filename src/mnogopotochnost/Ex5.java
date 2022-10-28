package mnogopotochnost;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("myPotok");
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("name of MyThread5 :" + myThread5.getName()  +" , Priority MyThread5 :" + myThread5.getPriority());

    }
}

class MyThread5 extends Thread{
    @Override
    public void run() {
        System.out.println("Privet");
    }
}