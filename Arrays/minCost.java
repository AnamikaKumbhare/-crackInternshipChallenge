class Solution {
    public int[] minCosts(int[] cost) {
        int[] arr=new int[cost.length];
        int min=Integer.MAX_VALUE;

        for(int i=0;i<cost.length;i++){
            min=Math.min(min, cost[i]);
            arr[i]=min;
        }
        return arr;
    }
}