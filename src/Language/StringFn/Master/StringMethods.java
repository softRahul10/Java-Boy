package Language.StringFn.Master;

public class StringMethods {
    public static void main(String[] args) {
        String coderName = new String("Rahul Keshri");

        //codePointAt(index)
        System.out.println(coderName.codePointAt(1));
        System.out.println("b".codePointAt(0));

        //charAt(index)
       /* System.out.println(coderName.charAt(0)); //R
        try {
            System.out.println(coderName.charAt(coderName.length())); //i
        }catch(Exception e) {
            System.out.println(e);
        }*/
    }
}
