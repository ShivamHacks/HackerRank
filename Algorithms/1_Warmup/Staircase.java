import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	// Problem: create a staircase like this:
	//      #
	//     ##
	//    ###
	//   ####
	//  #####
	// ######

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = i; j < height; j++) { System.out.print(" "); }
            for (int k = i; k > 0; k--) { System.out.print("#"); }
            System.out.println();
        }
    }
}
