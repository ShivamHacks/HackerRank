import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // https://www.hackerrank.com/challenges/angry-professor

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int k = in.nextInt();
            for(int j=0; j < n; j++){
                if (in.nextInt() <= 0) { k--; }
            }
            if (k <= 0) { System.out.println("NO"); }
            else { System.out.println("YES"); }
        }
    }
}
