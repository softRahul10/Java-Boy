package Language.StringFn;



public class String1 {

    public static void main(String[] args) {
      /* Palindrome String */
        String str = "RAHUL";
        System.out.println(checkPalindrome2(str));

    }
    /* My solution (Time - 0(n) , Space - 0(n)) */
    public static boolean checkPalindrome(String str){
      boolean result = false;
      String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
             str2 = str2 + str.charAt(i);
        }
        if(str2.equals(str)){
            result = true;
        }

      return result;
    }

    /* My Second Solution (Time - O(N) , Space - O(1) ) */
    /* My Second Approach and Sir's Efficient Approach both are same ^_^ */
    public static boolean checkPalindrome2(String str){
        boolean result = false;
        int s = 0;
        int e = str.length() - 1;
        for(int i = 1; i <= (str.length()/2); i++){
            if(str.charAt(s) == str.charAt(e)){
                result = true;
                s++;
                e--;
            }else break;
        }
        return result;
    }

    /* Sandeep Sir's Naive Solution ( Time - 0(n), Space - 0(n) ) */
    public static boolean isPalindrome(String str){
        StringBuilder str2 = new StringBuilder(str);
        str2.reverse();
        return str.equals(str2.toString());
    }




}
