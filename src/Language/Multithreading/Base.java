package Language.Multithreading;

public class Base {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.start();
        System.out.println("one");
        System.out.println("Two");
    }
}

/* Runnable Class */
class Demo extends Thread {
    @Override
    public void run() {
        for( int i=1; i <= 10; i++ ) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
