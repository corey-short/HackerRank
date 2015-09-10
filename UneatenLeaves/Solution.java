import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int countUneatenLeaves(int n, int[] ar) {
        final Set<Integer> set = populateSet(n);
        final int result = eatLeaves(ar, set);
        return result;
    }
    
    static Set<Integer> populateSet(int n) {
        final Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            set.add(i);
        }
        return set;
    }

    static int eatLeaves(int[] ar, Set<Integer> set) {
        for (int j : ar) {
            removeElementsFromSet(j, set);
        }
        final int result = set.size();
        return result;
    }

    static void removeElementsFromSet(int j, Set<Integer> set) {
        final Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            final Integer setElement = iterator.next();
            if (setElement % j == 0)
                iterator.remove();
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        int _N;
        _N = Integer.parseInt(in.nextLine());
        
        
        int _A_size = Integer.parseInt(in.nextLine());
        int[] _A = new int[_A_size];
        int _A_item;
        for(int _A_i = 0; _A_i < _A_size; _A_i++) {
            _A_item = Integer.parseInt(in.nextLine());
            _A[_A_i] = _A_item;
        }
        
        res = countUneatenLeaves(_N, _A);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
    }
}
