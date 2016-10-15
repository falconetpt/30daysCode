import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < number; i++) {
            String leftStr = "";
            String rightStr = "";
            String word = scan.nextLine();
            
            for(int j = 0, n = word.length(); j < n; j++) {
                if (j % 2 == 0) {
                    leftStr += word.charAt(j) + "";
                } else {
                    rightStr += word.charAt(j) + "";
                }
            }
            System.out.println(leftStr + " " + rightStr);   
        }
        
        
        
    }
}