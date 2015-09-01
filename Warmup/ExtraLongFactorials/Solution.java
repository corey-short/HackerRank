import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE))
            return n;
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
    
    public static void printFactorial(BigInteger bigInt) {
        final BigInteger result = factorial(bigInt);
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            final BigInteger input = new BigInteger(br.readLine());
            printFactorial(input);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
