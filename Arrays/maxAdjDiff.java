class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=0;
        for(int i=1;i<nums.length;i++){
            max=Math.max(Math.abs(nums[i-1]-nums[i]), max);
        }
        max=Math.max(max, Math.abs(nums[0]-nums[nums.length-1]));
        return max;
    }
}