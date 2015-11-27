import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // Problem: For any number N, find how many of its digits divide evenly
    // Example: N = 122, # of digits that divide evenly = 2
    // Because 122 % 1 = 0, 122 % 2 = 0, and 122 % 4 != 0

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            findDigits(n);
        }
    }
    
    public static void findDigits(int n) {
        String div = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < div.length(); i++) {
            int digit = Integer.parseInt(div.substring(i, i + 1));
            if ( (digit != 0) && (n % digit == 0) ) { sum++; }
        }
        System.out.println(sum);
    }
}
