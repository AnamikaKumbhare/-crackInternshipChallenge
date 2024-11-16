import java.util.*;

class Solution {
    public int nthUglyNumber(int n) {
        int[] primes = {2, 3, 5};
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> visited = new HashSet<>(); 

        pq.add(1L); 
        visited.add(1L);

        long def = 1; 
        while (n > 0) {
            def = pq.poll(); 
            for (int prime : primes) {
                long curr = def * prime; 
                if (!visited.contains(curr)) {
                    visited.add(curr);
                    pq.add(curr);
                }
            }
            n--;
        }

        return (int) def; 
    }
}

