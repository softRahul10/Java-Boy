package Language.StringFn.MasterString;

public class Basics {
    public static void main(String[] args) {
        String username = new String("Virat");
        StringBuffer sb = new StringBuffer("Happy");

        username.concat(" is a cricketer");
        sb.append(" Diwali");

        System.out.println(username);
        System.out.println(sb);
    }
}
