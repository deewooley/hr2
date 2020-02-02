import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class hr2 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String S = in.next();
            int start = in.nextInt();
            int end = in.nextInt();
            char[] inputArray = S.toCharArray();
            for(int x = start; x<end; x++){
                System.out.print(inputArray[x]);
            }
        }
    }


