package DSA.BitManipulation.Badshah;

public class GeneratePowerSet {

    public static void main(String[] args) {
        powerSet("xyz");
    }

    public static void powerSet(String str) {
        if(str.isEmpty()) return;
        if(str.length() == 1) {
            System.out.print(str);
        }

        int n = str.length();
        int counter = (int)Math.pow(2,n);

        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < n; j++) {
                if((i & (1 << j)) != 0) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println("");
        }
    }
}
