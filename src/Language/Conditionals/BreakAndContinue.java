package Language.Conditionals;

public class BreakAndContinue {
    public static void main(String[] args) {
        printOnlyOddNumbers();
        System.out.println();
        printOnlyEvenNumbers();
        System.out.println();

        System.out.println("Before Loop");
        for(int i = 1; i <= 1000; i++){
            System.out.println(i);
            if(i == 10){
                break;
            }
        }
        System.out.println("After Loop");
    }
    public static void fn(){
        main:
        for(int i = 1; i <= 3; i++){
            notMain:
            for(int j = 1; j <=3; j++){
                if( i == 2){
                    break notMain;
                }
                System.out.println(" " + i + "," + j);
            }
        }
    }

    public static void printOnlyEvenNumbers(){
        for(int i = 1; i <= 100; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.print(i);
            System.out.print(" , ");
        }
    }

    public static void printOnlyOddNumbers(){
        for(int i = 1; i <= 100; i++){
            if(i%2 == 0){
                continue;
            }
            System.out.print(i);
            System.out.print(" , ");
        }
    }
}
