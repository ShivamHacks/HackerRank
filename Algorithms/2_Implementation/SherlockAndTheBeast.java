import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // https://www.hackerrank.com/challenges/sherlock-and-the-beast

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            boolean done = false;
            for (int m = 0; m <= n / 5; m++) {
                if ( n-(m*5) >= 0 && ((n - (m * 5)) % 3 == 0) ) {
                    StringBuilder fives = new StringBuilder();
                    StringBuilder threes = new StringBuilder();
                    for (int h = 0; h < n-m*5; h++) { fives.append("5"); }
                    for (int g = 0; g < m*5; g++) { threes.append("3"); }
                    System.out.println(fives.toString() + threes.toString());
                    done = true;
                    break;
                }
            }
            if (!done) { System.out.println("-1"); }
        }
    }
}
