class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        //store frequency
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> a.v - b.v);
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            int i=entry.getKey();
            int j=entry.getValue();
            pq.add(new Pair(i,j));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ans=new int[k];
        int z=0;
        while(k>0){
            int res = pq.poll().k;
            ans[z++]=res;
            k--;
        }
        return ans;
    }
}
class Pair{
    int k;
    int v;
    Pair(int k, int v){
        this.k=k;
        this.v=v;
    }
}