import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void quicksort(int[] ar, int lo, int hi) {
        if (lo < hi) {
            final int pivot = partition(ar, lo, hi);
            printArray(ar);
            quicksort(ar, lo, pivot-1);
            quicksort(ar, pivot+1, hi);
        }
    }
    
    public static int partition(int[] ar, int lo, int hi) {
        final int pivot = ar[hi];
        int i = lo;
        for (int j=lo; j <= hi-1; j++) {
            if (ar[j] <= pivot) {
            swap(ar, i, j);
            i = i + 1;
            }
        }
        swap(ar, i, hi);
        return i;
    }
    
    public static void swap(int[] ar, int lo, int hi) {
        final int tmp = ar[lo];
        ar[lo] = ar[hi];
        ar[hi] = tmp;
    }
    
    public static void printArray(int[] ar) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < ar.length; i++) {
            sb.append(ar[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        final Scanner sc = new Scanner(System.in);
        final int n = Integer.parseInt(sc.nextLine());
        final int[] ar = new int[n];
        for (int i=0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        quicksort(ar, 0, ar.length-1);
    }
}
