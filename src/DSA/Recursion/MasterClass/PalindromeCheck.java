package DSA.Recursion.MasterClass;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }

    public static boolean isPalindrome(String str, int s, int e) {
        if(str.length() < 2) return true;

        if(str.charAt(s) != str.charAt(e)) return false;

        return isPalindrome(str,++s,--e);
    }
}
