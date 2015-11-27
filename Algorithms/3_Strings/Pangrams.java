import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String sentence = "";
        while (in.hasNext()) {
            sentence += in.next();
        }
        char[] test = sentence.toLowerCase().toCharArray();
    
        List<Character> all = new ArrayList<Character>();
        for (char c : test) { all.add(c); }
        List<Character> alphabet = Arrays.asList( 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        
        boolean[] indexes = new boolean[alphabet.size()];
        for(Character c : alphabet) {
            if (all.contains(c)) { indexes[alphabet.indexOf(c)] = true; }
        }
        
        String message = "pangram";
        for (boolean check : indexes) {
            if (!check) { message = "not pangram"; }
        }
        System.out.println(message);
        
    }
}