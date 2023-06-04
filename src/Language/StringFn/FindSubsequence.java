package Language.StringFn;

public class FindSubsequence {
    public static void main(String[] args) {
        String str = "ABCD";
        String str2 = "CA";
        System.out.println(findSubsequence(str,str2));
    }
    public static boolean findSubsequence(String str,String str2){
        int i = 0;
        int j = 0;
        while ( i < str.length()){
            if(str.charAt(i) == str2.charAt(j)){
                j++;
            }
            i++;
            if(j == str2.length())
                return true;
        }
        return false;
    }
}
