package Language.ExceptionHandling;

public class EH1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        try {
            int c = a / b;
            System.out.println("Result : " + c);
        }catch (ArithmeticException obj){
            System.out.println("Invalid Input!");
        }finally {
            System.out.println("RK Technologies");
        }




        System.out.println("Thankyou very much for using our services");
    }
}
