import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // https://www.hackerrank.com/challenges/cavity-map

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int grid[][] = new int[n][n];
        String gridS[][] = new String[n][n];
        
        // Format the data
        for (int gridI = 0; gridI < n; gridI++) {
            String gridRow = in.next();
            int[] gridR = new int[n];
            String[] gridRS = new String[n];
            for (int gridJ = 0; gridJ < n; gridJ++) {
                gridR[gridJ] = Integer.parseInt(gridRow.substring(gridJ, gridJ + 1));
                gridRS[gridJ] = gridRow.substring(gridJ, gridJ + 1);
            }
            grid[gridI] = gridR;
            gridS[gridI] = gridRS;
        }
        
        // Find Cavities
        for (int a = 1; a < n-1; a++) {
            for (int b = 1; b < n-1; b++) {
                if ( grid[a][b] > grid[a][b-1] 
                    && grid[a][b] > grid[a][b+1]
                    && grid[a][b] > grid[a+1][b]
                    && grid[a][b] > grid[a-1][b] ) {
                    gridS[a][b] = "X";
                }
            }
        }
        
        // Print the Data
        for (int i = 0; i < gridS.length; i++) {
            for (int j = 0; j < gridS[i].length; j++) {
                System.out.print(gridS[i][j]);
            }
            System.out.println();
        }
    }
}
