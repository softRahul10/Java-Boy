package Language.Basics;
import java.lang.*;

public class Base1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        String out = obj.toString();
        System.out.println(obj.getClass());
        System.out.println(out);
    }
}

/* My class */
class MyClass {
    /* overriding Object Class's toString */
    public String toString() {
        return "My Special Object";
    }
}