import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int calculateAbsDiagonalDifference(int[][] ar) {
        int topLeftDiagonal = 0;
        int bottomLeftDiagonal = 0;
        for (int row=0; row < ar.length; row++) {
            topLeftDiagonal += ar[row][row];
            bottomLeftDiagonal += ar[ar.length-1-row][row];
        }
        final int absDifference = Math.abs(topLeftDiagonal - bottomLeftDiagonal);
        return absDifference;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        final Scanner sc = new Scanner(System.in);
        final int n = Integer.parseInt(sc.nextLine());
        final int[][] ar = new int[n][n];
        int row = 0;
        while (row < n) {
            for (int i=0; i < ar.length; i++) {
                ar[i][row] = sc.nextInt();
            }
            row += 1;
        }
        final int result = calculateAbsDiagonalDifference(ar);
        System.out.printf("%d", result);
    }
}
