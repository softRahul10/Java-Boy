package DSA.String.Master;

public class String01 {
    public static void main(String[] args) {
        printChar("Rahul Kumar Keshri");
    }

    // Print Frequencies of Characters in sorted order
    public static void printChar(String str) {
        // Array of size : 26
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(count[i] > 0) {
                System.out.print((char)(i+'a') + " : ");
                System.out.print(count[i]);
            }
        }
    }
}
