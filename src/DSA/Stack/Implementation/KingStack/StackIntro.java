package DSA.Stack.Implementation.KingStack;
import java.util.ArrayDeque;
import java.util.Stack;

public class StackIntro {
    public static void main(String[] args) {
        // stack creation
        Stack<Character> s2 = new Stack<>();
        ArrayDeque<Character> s = new ArrayDeque<>();

        // push
        s.push('R');
        s.push('a');
        s.push('h');
        s.push('u');
        s.push('l');

        System.out.println("After push " + s);

        // pop
        System.out.println("After pop");
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }


        s.push('Z');
        s.push('A');

        // peek
        System.out.println("After peek " + s.peek());


    }
}
