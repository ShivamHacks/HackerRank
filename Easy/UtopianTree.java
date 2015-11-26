import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
        Problem: A tree grows 2 times every year. 
        Every spring, the tree doubles in height and every summer the tree grows 1 meter.
        I plant the tree with an initial height of 1.
        What will be the tree's height after C cycles?
    */
    
    // Data
        // Sample Input
            // 3
            // 0
            // 1
            // 4
        // Sample Output
            // 1
            // 2
            // 7

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int initialH = 1;
        for(int i = 0; i < t; i++){
            int cycles = in.nextInt();
            int height = initialH - 1;
            int start = 0;
            while(start <= cycles) {
                if (start % 2 == 0) {
                    height += 1;
                } else {
                    height *= 2;
                }
                start++;
            }
            System.out.println(height);
        }
    }
}
