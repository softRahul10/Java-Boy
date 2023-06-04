package Language.ExceptionHandling.Master;

public class ExampleOneEH {
    public static void main(String[] args) {
        printOne();
    }

    /* function 1*/
    private static void printOne() {
        System.out.println("Function Number : " + 1);
        printTwo();
    }

    /*function 2*/
    private static void printTwo() {
        System.out.println("Function Number : " + 2);
        printThree();
    }

    /*function 3*/
    private static void printThree() {
        System.out.println("Function Number : " + 3);
       printFirstAndLastElement(new int[]{1, 2, 3, 4});
    }

    /* Exceptional function */
    private static void printFirstAndLastElement(int[] arr) {
        int firstIndex = 0;
        int lastIndex = arr.length;

        try {
            System.out.println("First Element is : " + arr[firstIndex]);
            System.out.println("Last Element is : " + arr[lastIndex]);
        }catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println("Something Wrong with Arrays :( ");
        }
        System.out.println(" Program is End Now!");
        System.out.println("Thank you for using our Services");
    }
}
