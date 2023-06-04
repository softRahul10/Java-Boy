package Language.StringFn.Master;

public class StringConstructors {
    public static void main(String[] args) {
        // Creating empty String Object
        String emptyString = new String();
        System.out.println(emptyString.length());

        // Creating string from literal
        String str = new String("Some content goes here...");
        System.out.println(str.length());

        // Creating String from byte array
        byte[] lowerCaseLettersCode = new byte[] {65,66,67,68};
        String byteString = new String(lowerCaseLettersCode);
        System.out.println(byteString);

        // Creating String object using char array
        char[] vowels = new char[] {'a','i','e','o','u'};
        String charString = new String(vowels);
        System.out.println(charString);
        System.out.println(charString.length());

    }
}
