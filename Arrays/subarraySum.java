class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int start=Math.max(0, i-nums[i]);
            int tempsum=0;
            for(int j=start;j<=i;j++){
                tempsum+=nums[j];
            }
            sum+=tempsum;
        }
        return sum;
    }
}