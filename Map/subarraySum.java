import java.util.HashMap;
import java.util.Map;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        int sum=0, count=0;
        hm.put(0,1);
        for(int num:nums){
            sum+=num;
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }
                hm.put(sum, hm.getOrDefault(sum,0)+1);
            
        }
        return count;
    }
}