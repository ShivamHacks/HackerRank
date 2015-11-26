import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // Data
        // 07:05:45PM
        // 19:05:45

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        DateFormat have = new SimpleDateFormat("hh:mm:ssa");
        DateFormat want = new SimpleDateFormat("HH:mm:ss");
        
        try {
             System.out.println(want.format(have.parse(time)));
        } catch (ParseException ex) {
             System.out.println("Error");
        }
        
    }
}
