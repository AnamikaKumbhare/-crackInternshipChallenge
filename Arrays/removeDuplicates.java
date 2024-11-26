package Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int newind=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[newind++]=nums[i];
            }
        }
        return newind;
    }
}
