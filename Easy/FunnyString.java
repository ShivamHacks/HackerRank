import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // Problem: Check if string is funny by:
        // Seeing if | Si − Si−1 |=| Ri − Ri−1 |
    // Data
        // 2
        // acxz
        // bcxz
    // Example that is Funny:
        // |c-a| = |x-z| = 2
        // |x-c| = |c-x| = 21
        // |z-x| = |a-c| = 2
    // Example that is not Funny:
        // |c-b| != |x-z|

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int t = 0; t < n; t++) {
            String expression = in.next();
            char[] chars = expression.toLowerCase().toCharArray();
            for (int i = 1; i < chars.length; i++) {
                if (!(Math.abs(chars[i] - chars[i-1]) == Math.abs(chars[chars.length-i] - chars[chars.length-i-1])) ) {
                    System.out.println("Not Funny");
                    break;
                } else if (i == chars.length-1) {
                    System.out.println("Funny");
                }
            }
        }
    }
}