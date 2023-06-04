package InterviewPattern.FastSlowPointer;

public class HappyNumber {
    public static void main(String[] args) {
        int number = 12;
        int number2 = 23;
        System.out.println(number + " is Happy Number ? " + findHappy(number));
        System.out.println(number2 + " is Happy Number ? " + findHappy(number2));
    }

    /* find happy Number */
    public static boolean findHappy(int num) {
        // use fast & slow pattern
        int slow = num;
        int fast = num;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (slow != fast);

        return slow == 1;
    }

    /* Square function */
    public static int findSquare(int n) {
        int sum = 0;
        int digit;
        while(n > 0) {
            digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }


}
