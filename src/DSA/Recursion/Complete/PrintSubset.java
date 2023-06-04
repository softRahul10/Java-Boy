package DSA.Recursion.Complete;

public class PrintSubset {
    public static void main(String[] args) {
        printStringSubset("abc",0);
    }
    public static void printStringSubset(String str,int id) {
        // Base Case
        if(id == str.length()) {
            return;
        }
        // Recursive Case
        System.out.println(str.charAt(id));
        printStringSubset(str,++id);
    }
}
