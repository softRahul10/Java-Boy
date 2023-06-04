package Language.Collection.Stack;

import java.util.Stack;

public class StackBasics {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        s.push('R');
        s.push('A');
        s.push('H');
        s.push('U');
        s.push('L');

        while(s.size()!=0) {
            System.out.println(s.pop());
        }
    }
}
