import java.util.PriorityQueue;
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]
        );

        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[] {nums[i], i});
        }
        while (k > 0) {
            int[] curr = pq.poll();
            int element = curr[0];
            int index = curr[1];

            int newElement = element * multiplier;
            nums[index] = newElement;

            pq.offer(new int[] {newElement, index});
            k--;
        }

        return nums;
    }
}

