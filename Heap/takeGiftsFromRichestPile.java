import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int gift : gifts) {
            pq.add(gift);
        }
        for (int i = 0; i < k; i++) {
            int curr = pq.poll(); 
            int reducedGift = (int) Math.floor(Math.sqrt(curr)); 
            pq.add(reducedGift); 
        }
        
        long sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        
        return sum;
    }
}

