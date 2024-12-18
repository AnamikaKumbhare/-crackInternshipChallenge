package Codechef;

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt(); 
            int k = sc.nextInt(); 
            
            int minDifference = Integer.MAX_VALUE; 
            for (int l = 1; l <= n; l++) {
                for (int w = 1; w <= m; w++) {
                    int perimeter = 2 * (l + w); // Calculate perimeter
                    int difference = Math.abs(perimeter - k); 
                    minDifference = Math.min(minDifference, difference); 
                }
            }
            
            
            System.out.println(minDifference);
        }
        sc.close();
    }
}


