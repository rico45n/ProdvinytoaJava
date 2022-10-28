package mnogopotochnost;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("1");

           new Thread(new Runnable() {
               @Override
               public void run() {
                   System.out.println("2");
               }
           }).start();
           new Thread(()-> System.out.println("3")).start();

    }
}
