import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // https://www.hackerrank.com/challenges/the-grid-search

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for (int z = 0; z < t; z++) {
            
            // format the data
            int gridRows = in.nextInt();
            int gridCols = in.nextInt();
            String[] grid = new String[gridRows];
            for (int i = 0; i < gridRows; i++) {
                grid[i] = in.next();
            }
            int pattRows = in.nextInt();
            int pattCols = in.nextInt();
            String[] patt = new String[pattRows];
            for (int j = 0; j < pattRows; j++) {
                patt[j] = in.next();
            }
            
            // test
            boolean done = false;
            for (int a = 0; a < grid.length; a++) {
                if (grid[a].contains(patt[0])) {
                    int index = grid[a].indexOf(patt[0]);
                    for (int b = 1; b < patt.length; b++) {
                        if (grid[a+b].indexOf(patt[b]) == index) {
                            done = true;
                        } else {
                            done = false;
                            break;
                        }
                    }
                    
                }
            }
            if (done) { System.out.println("YES"); }
            else { System.out.println("NO"); }
        }
    }
}
