package Hash;
import java.util.Arrays;
import java.util.HashSet;
class Solution {
    public int maxDistinctElements(int[] nums, int k) {
       
        Arrays.sort(nums);

        HashSet<Integer> uniqueElements = new HashSet<>();
        int minimumAllowed = Integer.MIN_VALUE;

        for (int current : nums) {
          
            int candidateValue = Math.max(minimumAllowed, current - k);

            if (candidateValue <= current + k) {
                uniqueElements.add(candidateValue);
                minimumAllowed = candidateValue + 1;
            }
        }

        return uniqueElements.size();
    }
}

