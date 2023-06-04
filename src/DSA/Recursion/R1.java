package DSA.Recursion;

public class R1 {
    public static void main(String[] args) {
        System.out.println("Main Line : Start");
        printNumber(4);
        System.out.println("Main Line : End");
    }

    public  static void printNumber(int number){
        if(number<1)
            return;
            System.out.println(number);
            printNumber(number-1);
            System.out.println(number);

    }
}
