package mnogopotochnost;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Roman" , lock);
        new Employee("Dasha" , lock);
        new Employee("Silva" , lock);
        Thread.sleep(5000);
        new Employee("Nuric" , lock);
        new Employee("Rico" , lock);

    }
    
}


class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if(lock.tryLock()) {
            try {
//            System.out.println(name + " Ждет...");
//            lock.lock();
                System.out.println("Пользователь пользуется банкоматом : " + name);
                Thread.sleep(2000);
                System.out.println("Пользователь завержил всои дела : " + name);
            } catch (Throwable e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }else {
            System.out.println(name + " Не хочет ждать");
        }
    }
}