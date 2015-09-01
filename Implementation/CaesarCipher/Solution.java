import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String encryptString(char[] c, int k) {
        StringBuilder result = new StringBuilder(c.length);
        for (int i = 0; i < c.length; i++) {
            if (isValidASCIICharacter(c[i])) {
                if(!checkIfWrapAround(c[i], k)) {
                    final char encryptedChar = (char) (c[i]+k);
                    result.append(encryptedChar);
                }
                else {
                    final char encryptedWrappedChar = wrapCharAround(c[i], k);
                    result.append(encryptedWrappedChar);
                }
            }
            else {
                result.append(c[i]);
            }
        }
        return result.toString();
    }
    
    public static char wrapCharAround(char c, int k) {
        final String alphabet = createAlphabet(c);
        final int charIndex = alphabet.indexOf(c);
        final int wrappedIndex = (charIndex + k) % alphabet.length();
        return alphabet.charAt(wrappedIndex);
    }
    
    public static boolean checkIfWrapAround(char c, int k) {
        final String alphabet = createAlphabet(c);
        final int charIndex = alphabet.indexOf(c);
        if (charIndex + k > alphabet.length() - 1)
            return true;
        return false;
    }
    
    public static String createAlphabet(char c) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        if (Character.isUpperCase(c))
            alphabet = alphabet.toUpperCase();
        return alphabet;
    }
    
    public static boolean isValidASCIICharacter(char c) {
        if (Character.isAlphabetic(c))
            return true;
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {        
            final int len = Integer.parseInt(br.readLine());
            final char[] c = br.readLine().toCharArray();
            final int k = Integer.parseInt(br.readLine());
            result = encryptString(c, k);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(result);
        }
    }
}
