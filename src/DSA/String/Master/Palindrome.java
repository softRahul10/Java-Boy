package DSA.String.Master;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome2("GeeksForGeek"));
    }

    // Naive Approach
    public static boolean checkPalindrome2(String str) {
        StringBuilder sb = new StringBuilder(str);
        return (sb.reverse().toString().equals(str));
    }

    // Palindrome String
    public static boolean checkPalindrome(String str) {
        // I can use Two pointer Approach here
        int p1 = 0;
        int p2 = str.length() - 1;
        while(p1 < p2) {
            if(str.charAt(p1) != str.charAt(p2)) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
