package DSA.Array.Questions;

public class LargestElement {
    public static void main(String[] args){
        int[] array = {5,8,20,10};
        System.out.println(getLargest(array));
        System.out.println(findLargest(array));
    }
    /* Find - Largest Element in a given Array */
    public static int findLargest(int[] num){
        int max = 0;
        int id =0;
        for(int i =0; i<num.length; i++){
            if(num[i]>max){
                max = num[i];
                id = i;
            }
        }
        return id;
    }

    /* Naive Approach - Sandeep sir */
    public static int getLargest(int[] num){
        for(int i = 0; i < num.length; i++){
            boolean flag = true;
            for(int j = 0; j < num.length; j++){
                if(num[j] > num[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }

        return -1;
    }
}
