package Arrays;

class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int current = 0;
        int end = nums.length - 1;

        while (current <= end) {
            if (nums[current] == 0) {
                if (nums[start] != 0) swap(nums, start, current);
                start++;
                current++;
            } else if (nums[current] == 1) {
                current++;
            } else {
                if (nums[end] != 2) swap(nums, current, end);
                end--;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
