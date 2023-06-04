package DSA.Array.Questions;

public class SecondLargestElement {
    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[]{10,10,10}));
    }

    /* Find - SecondLargest Element in an Array */
    // CREATE MAX and ID
    // FIND FIRST LARGEST ELEMENT
    // AFTER THIS...
    // USE INDEX AND VALUE OF LARGEST ELEMENT TO FIND
    // SECOND LARGEST ELEMENT
    public static int getSecondLargest(int[] number){
        int max = 0;
        int id = 0;
        for(int i = 0; i<number.length; i++){
            if(number[i]>max){
                max = number[i];
                id = i;
            }
        }
        int max2 = 0;
        int id2 = -1;
        for(int j = 0; j<number.length; j++){
            if( number[j] != max){
                if(number[j]>max2){
                    max2 = number[j];
                    id2 = j;
                }
            }
        }
        return id2;

    }

}
