package Questions.BitManipulation;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number : ");
        int number = in.nextInt();
        if((number&1) == 1){
            System.out.println("ODD Number");
        }else{
            System.out.println("EVEN Number");
        }
    }
}
