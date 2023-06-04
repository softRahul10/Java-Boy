/* Reverse Words in a String */


package DSA.String.LeetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
      String text = "the    sky    is   blue";
      String res = reverseWord2(text);
        System.out.println(res);
    }

    /* My Solution */
    public static String reverseWord(String s) {

       StringBuilder sb = new StringBuilder();
       while(!s.isEmpty()) {
           s = s.trim();
           int spaceIndex = s.indexOf(' ');
           if(spaceIndex > 0){
               sb.append(s.substring(s.lastIndexOf(' ')+1));
           }else{
               sb.append(s.substring(0));
           }
           if(spaceIndex > 0) {
               s = s.substring(0,s.lastIndexOf(' '));
           }else{
               s = "";
           }
           sb.append(" ");

       }

       return sb.toString().trim().replace(' ','*');
    }

    /* Efficient Solution */
    public static String reverseWord2(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strArray = s.trim().split("\\s+");
        for( String data:strArray) {
            System.out.println(data);
        }
        for(int  i = strArray.length - 1; i >= 0; i--) {
            sb.append(strArray[i]).append(" ");
        }
        return sb.toString();
    }
}
