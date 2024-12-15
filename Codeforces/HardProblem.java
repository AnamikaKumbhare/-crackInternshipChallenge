import java.util.*;
import java.io.*;

public class HardProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            long m = sc.nextLong();
            long a = sc.nextLong(); 
            long b = sc.nextLong(); 
            long c = sc.nextLong(); 

            long totalSeats = 2 * m;

            long seatedInRow1 = Math.min(a, m);

            long seatedInRow2 = Math.min(b, m);

            long totalSeated = seatedInRow1 + seatedInRow2;

            long remainingSeats = totalSeats - totalSeated;

            totalSeated += Math.min(c, remainingSeats);

            System.out.println(totalSeated);
        }
        sc.close();
    }
}
