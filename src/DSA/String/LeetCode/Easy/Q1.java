/* Longest Common Prefix in a String */



package DSA.String.LeetCode.Easy;

public class Q1 {
    public static void main(String[] args) {
       String[] strs = {"flower","flight","flow"};
       String res = longestCommonPrefix2(strs);
       System.out.println(res);
    }

    /* My Solution (Not able to solve)*/
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        int charCount = 0;
        char ch = strs[0].charAt(charCount); // f
        int charLen = strs[0].length();

        while(charLen >= 0) {
            for( int i=1; i < strs.length; i++) {
                if(strs[i].charAt(charCount) != ch) {
                    return sb.toString();
                }
            }
            sb.append(ch);
            charCount++;
            ch = strs[0].charAt(charCount);
            charLen = charLen - 1;
        }

        return sb.toString();
    }

    /* Solution Tutorial */
   public static String longestCommonPrefix2(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0]; //flower
        for(int i=1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
