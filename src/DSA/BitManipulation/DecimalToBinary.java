package DSA.BitManipulation;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 17;
        System.out.println( n + " binary : " + convertBinary(n));
        System.out.println( n + " Octal : " + convertOctal(n));
        System.out.println( n + " HEX : " + convertHex(n));

    }

    /* Convert Decimal Number to Binary Number */
    public static String convertBinary(int n) {
        StringBuilder sb = new StringBuilder();
        int digit;
        while(n>0) {
            digit = n % 2;
            sb.append(digit);
            n = n/2;
        }
        return sb.reverse().toString();
    }

    /* Convert Decimal Number into Octal */
    public static String convertOctal(int n) {
        StringBuilder sb = new StringBuilder();
        int digit;
        while(n>0) {
            digit = n % 8;
            sb.append(digit);
            n = n/8;
        }
        return sb.reverse().toString();
    }

    /* Convert Decimal Number into HEX Number */
    public static String convertHex(int n) {
        StringBuilder sb = new StringBuilder();
        int digit;
        while(n>0) {
            digit = n % 16;
            sb.append(digit);
            n = n/16;
        }
        return sb.reverse().toString();
    }
}
