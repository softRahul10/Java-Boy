package Language.Conditionals;

import java.util.Scanner;

public class SwitchConditional {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n1,n2,sum = 0;
        char op;

        System.out.println("Number 1:");
        n1 = key.nextInt();

        System.out.println("Number 2:");
        n2 = key.nextInt();

        System.out.println("Operator (+,-,/,*) ");
        op = key.next().trim().charAt(0);

        /* Switch Case */
        switch (op){
            case '+':
                // block of code
                sum = n1 + n2;
                break;
            case '-':
                sum = n2 - n1;
                break;
            case '*':
                sum = n1 * n2;
                break;
            case '/':
                sum = n2/n1;
                break;
            default:
                System.out.println("Invalid Operator");

        }

        System.out.println(sum);

    }
}
