class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;

        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int count = 0;
        long sumLeft = 0;

        for (int i = 0; i < n - 1; i++) {
            sumLeft += nums[i];
            long sumRight = totalSum - sumLeft;

            if (sumLeft >= sumRight) {
                count++;
            }
        }

        return count;
    }
}
