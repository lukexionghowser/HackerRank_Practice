package One;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hackerank {

// using if/else with odd/even

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int N = input.nextInt();
        //int N = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    if (N >=2 && N <=5 && (N % 2) == 0) {
    // even and in range of 2-5
    System.out.print("Not Weird");
    //} else if(N <=5 && (N % 2) == 0) {
        // even and in range of 2-5
    //System.out.print("Not Weird");
        }  else if(N >= 6 && N < 20 && (N % 2) == 0 ) {
        // even and in range of 6-20
    System.out.print("Weird");
        }  else if(N >20 && (N % 2) == 0) {
        // even and in range of 2-5
    System.out.print("Not Weird");
        }
        else {
    // odd
    System.out.print("Weird");
    }
       // scanner.close();
    }
}