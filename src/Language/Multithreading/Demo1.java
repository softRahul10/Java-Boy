package Language.Multithreading;


class MyThread extends Thread {
    @Override
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(" -----> Secondary Thread <----- ");
            i++;
        }
    }
}


public class Demo1 {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.start();
        int i = 1;
        while(true) {
            System.out.println("----------------> Main Thread");
            i++;
        }
    }
}
