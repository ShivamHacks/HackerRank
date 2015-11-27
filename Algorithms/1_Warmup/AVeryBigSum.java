import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // Data:
        // 5
        // 1000000001 
        // 1000000002
        // 1000000003
        // 1000000004
        // 1000000005
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String base = n + "000000000";
        int sum = 0;
        while (in.hasNextInt()) {
            sum += in.nextInt() % 1000000000;
        }
        String sumS = Integer.toString(sum);
        System.out.println(base.substring(0, base.length() - sumS.length()) + sumS);
    }
}
