package Language.OOPs;

public class FinalConcept {
    // In java final == const
    final static String COUNTRY = "India";
    public static void main(String[] args) {
        // Error 1 - COUNTRY = "Nepal";
        System.out.println(COUNTRY);
        // Error 2 -
        Demo2 obj = new Demo2();
        // obj.display();
    }
}

 class Demo{
    public  void display() {
        System.out.println("Final Method");
    }
}

class Demo2 extends Demo{
    public  void display() {
        System.out.println("Method");
    }
}
