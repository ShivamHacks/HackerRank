import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // https://www.hackerrank.com/challenges/cut-the-sticks

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) { nums[i] = in.nextInt(); }
        Arrays.sort(nums);
        int lowest = nums[0];
        int sticksLeft = n;
        while (sticksLeft > 0) {
            System.out.println(sticksLeft);
            lowest = nums[n-sticksLeft];
            for (int k = n-sticksLeft; k < n; k++) {
                nums[k] -= lowest;
                if (nums[k] <= 0) { sticksLeft--; }
            }
        }
    }
}
