import java.util.*;
import java.io.*;

public class EasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;

            for (int b = 1; b < n; b++) {
                int a = n - b;
                if (a > 0) { 
                    count++;
                }
            }

            System.out.println(count); 
        }
        sc.close();
    }
}
