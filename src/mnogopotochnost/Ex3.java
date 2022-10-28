package mnogopotochnost;

public class Ex3 extends Thread{

    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();
        ex3.start();

        for(int i = 1000 ; i > 0 ; i --){
           System.out.println(i);
        }
//        Thread thread = new Thread(new MyThread3());
//        Thread thread2 = new Thread(new MyThread4());
//        thread.start();
//        thread2.start();




    }

    @Override
    public void run(){
        for(int i = 1 ; i <= 1000 ; i ++){
            System.out.println(i);
        }
    }

}

//
//class MyThread3 implements Runnable{
//    @Override
//    public void run(){
//        for(int i = 1 ; i <= 1000 ; i ++){
//            System.out.println(i);
//        }
//    }
//}
//
//class MyThread4 implements Runnable{
//    public void run(){
//        for(int i = 1000 ; i > 0 ; i --){
//            System.out.println(i);
//        }
//    }
//}