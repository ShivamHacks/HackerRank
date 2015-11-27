import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // https://www.hackerrank.com/challenges/chocolate-feast

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt(); // my money
            int c = in.nextInt(); // price per chocolate
            int m = in.nextInt(); // rate of wrappers to trade for a single chocolate
            
            int numChocs = n / c;
            int numWrappers = numChocs;
            
            while(numWrappers > 0) {
                if (numWrappers / m == 0) { break; }
                numChocs += numWrappers / m;
                numWrappers = numWrappers / m + numWrappers % m;

            }
            System.out.println(numChocs);
           
        }
    }
}
