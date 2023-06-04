package Questions.String;

public class ReverseString {
    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o'};
        reverseString(ch);
    }

    public static void reverseString(char[] s) {
        int p1 = 0;
        int p2 = s.length - 1;
        while (p1<p2) {
            char ch = s[p2];
            s[p2] = s[p1];
            s[p1] = ch;
            p1++;
            p2--;

        }
    }
}
