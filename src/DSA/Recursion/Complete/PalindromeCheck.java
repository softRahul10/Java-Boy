package DSA.Recursion.Complete;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s1 = "abbbba";
        String s2 = "geeks";
        boolean res = checkStringRi(s1,0,s1.length()-1);
        System.out.println(s1 + " is Palindrome : " + res);
    }

    /* Iterative Solution */
    public static boolean checkString(String str) {
        int s = 0;
        int e = str.length() - 1;
        while(s<e) {
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    /* Recursive Solution */
    public static boolean checkStringRi(String str, int s, int e) {
        /*BAse CAse*/
        if(s >= e) {
            return true;
        }
        if(str.charAt(s) != str.charAt(e)) {
            return false;
        }

        return checkStringRi(str,++s,--e);
    }
}
