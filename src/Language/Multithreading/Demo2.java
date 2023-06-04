package Language.Multithreading;

public class Demo2 {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        t.start();
        while(true) {
            System.out.println("------------> Main -------------> --------->");
        }
    }
}

/* Runnable Interface */
class MyRunnable implements Runnable {
    @Override
    public void run() {
        while(true) {
            System.out.println("******* Thread 0 ********");
        }
    }
}
