import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] A = new int[n];
            int total = 0;
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
                total += A[i];
            }
            
            // Calculate the threshold as an integer
            int threshold = (int) (0.5 * (n + 1) * 100);
            
            if (threshold < total) {
                System.out.println("0");
            } else if (threshold > total && threshold - total > 100) {
                System.out.println("-1");
            } else if (threshold > total) {
                System.out.println(threshold - total);
            }
        }
        sc.close();
    }
}
