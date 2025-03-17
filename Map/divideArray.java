class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int count:map.values()){
            if(count%2!=0){
                return false;
            }
        }
        return true;
    }
}