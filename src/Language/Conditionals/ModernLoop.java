package Language.Conditionals;

public class ModernLoop {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        char[] vowels = {'a','e','i','o','u'};
        for(char ch: vowels){
            System.out.println(ch);
        }
        int n = 0;
        do{
            System.out.println("HELLO");
            n++;
        }while(n<5);
    }
}
