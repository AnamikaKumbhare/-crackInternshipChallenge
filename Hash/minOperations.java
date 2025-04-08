class Solution {
    public int minimumOperations(int[] nums) {
        if (nums.length == 0) return 0;
        
        if (hasAllDistinct(nums, 0, nums.length)) return 0;
        
        int operations = 0;
        int startIndex = 0;
        
        while (startIndex < nums.length) {
           
            if (nums.length - startIndex < 3) {
                
                if (startIndex < nums.length) {
                    operations++;
                }
                break;
            }
         
            startIndex += 3;
            operations++;
        
            if (hasAllDistinct(nums, startIndex, nums.length)) {
                break;
            }
        }
        
        return operations;
    }
    
    private boolean hasAllDistinct(int[] nums, int start, int end) {
        Set<Integer> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            if (!set.add(nums[i])) {
                return false;
            }
        }
        return true;
    }
}