import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    // First problem I got wrong, becuase of many stupid indexing mistakes

    // Problem: Sort a number into an array of already sorted numbers (except for the number to sort)
    // Example Data 1:
        // Sample Input
            // 5
            // 2 4 6 8 3
        // Sample Output
            // 2 4 6 8 8 
            // 2 4 6 6 8 
            // 2 4 4 6 8 
            // 2 3 4 6 8
    // Example Data 2:
        // Sample Input
            // 10
            // 2 3 4 5 6 7 8 9 10 1
        // Sample Output
            // 2 3 4 5 6 7 8 9 10 10
            // 2 3 4 5 6 7 8 9 9 10
            // 2 3 4 5 6 7 8 8 9 10
            // 2 3 4 5 6 7 7 8 9 10
            // 2 3 4 5 6 6 7 8 9 10
            // 2 3 4 5 5 6 7 8 9 10
            // 2 3 4 4 5 6 7 8 9 10
            // 2 3 3 4 5 6 7 8 9 10
            // 2 2 3 4 5 6 7 8 9 10
            // 1 2 3 4 5 6 7 8 9 10
    // Example Data 3:
        // Sample Input
            // 14
            // 1 3 5 9 13 22 27 35 46 51 55 83 87 23
        // Sample Output
            // 1 3 5 9 13 22 27 35 46 51 55 83 87 87
            // 1 3 5 9 13 22 27 35 46 51 55 83 83 87
            // 1 3 5 9 13 22 27 35 46 51 55 55 83 87
            // 1 3 5 9 13 22 27 35 46 51 51 55 83 87
            // 1 3 5 9 13 22 27 35 46 46 51 55 83 87
            // 1 3 5 9 13 22 27 35 35 46 51 55 83 87
            // 1 3 5 9 13 22 27 27 35 46 51 55 83 87
            // 1 3 5 9 13 22 23 27 35 46 51 55 83 87


    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int[] sorter = ar.clone();
        int toSort = ar[sorter.length - 1];
        sorter[sorter.length - 1] = sorter[sorter.length - 2];
        int index = 1;
        boolean sorted = false;
        while (!sorted) {
            if (toSort < sorter[sorter.length - index - 1]) {
                sorter[sorter.length - index] = sorter[sorter.length - index - 1];
            } else {
                sorter[sorter.length - index] = toSort;
                sorted = true;
            }
            index++;
            printArray(sorter);
        }
    }
    
    
    /* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
 
