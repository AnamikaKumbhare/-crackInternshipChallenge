class Solution {
    public int findDuplicate(int[] nums) {
        int left = 1; 
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;

            // Count numbers less than or equal to mid
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            // If count > mid, the duplicate is in the left half
            if (count > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left; 
    }
}

