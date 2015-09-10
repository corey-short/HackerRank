import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int bitFlip(int[] ar) {
        int result = count1sAndConvert(ar);
        result += findMaxSubArray(ar);
        return result;
    }
    
    static int count1sAndConvert(int[] ar) {
        int result = 0;
        for (int i = 0; i < ar.length; i++) {
            result += ar[i];
            ar[i] = (ar[i] == 0) ? 1 : -1;
        }
        return result;
    }

    static int findMaxSubArray(int[] ar) {
        final LeftWindow left = new LeftWindow();
        final RightWindow right = new RightWindow();
        for (int i = 0; i < ar.length; i++) {
            if (right.val + ar[i] >= 0) {
                right.val += ar[i];
            }
            else {
                right.left = i + 1;
                right.val = 0;
            }
            if (left.val < right.val) {
                left.left = right.left;
                left.right = i;
                left.val = right.val;
            }
        }
        return left.val;
    }

    static class LeftWindow {
        private int val;
        private int left;
        private int right;
        
        public LeftWindow() {
            val = left = right = 0;
        }
    }

    static class RightWindow {
        private int val;
        private int left;
        
        public RightWindow() {
            val = left = 0;
        }
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        
        int _arr_size = Integer.parseInt(in.nextLine());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine());
            _arr[_arr_i] = _arr_item;
        }
        
        res = bitFlip(_arr);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
    }
}
