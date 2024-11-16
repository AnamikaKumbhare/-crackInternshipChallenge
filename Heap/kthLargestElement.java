class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int num:nums){
            pq.add(num);
        }
        
        int ans=0;
        while(k>0){
            ans=pq.poll();
            k--;
        }
        return ans;
    }
}