import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar) {
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
        int i,j,swap;
        for (i = 1; i < ar.length; i++) {
            swap = ar[i];
            j = i;
            while (j > 0 && ar[j-1] > swap) {
                ar[j] = ar[j-1];
                j = j-1;
            }
            ar[j] = swap;
            printArray(ar);
        }
    }
      
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++) {
            ar[i]=in.nextInt(); 
        }
        insertionSortPart2(ar);                
    }    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
