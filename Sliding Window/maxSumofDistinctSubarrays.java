import java.util.*;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        // Sliding window with distinct elements
        long maxSum = 0, currentSum = 0;
        HashSet<Integer> set = new HashSet<>();
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            // Remove elements from the start of the window until all are distinct
            while (set.contains(nums[end])) {
                set.remove(nums[start]);
                currentSum -= nums[start];
                start++;
            }

            // Add the current element
            set.add(nums[end]);
            currentSum += nums[end];

            // Check if the window size is exactly k
            if (end - start + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);

                // Slide the window forward by removing the start element
                set.remove(nums[start]);
                currentSum -= nums[start];
                start++;
            }
        }

        return maxSum;
    }
}

