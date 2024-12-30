class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int dp[]=new int[high+1];
        Arrays.fill(dp, -1);
        int ans=0;
        for(int i=low;i<=high;i++){
            ans=((ans%1_000_000_007)+(f(i, dp, zero, one)%1_000_000_007))%1_000_000_007;
        }
        return ans;
    }
    public int f(int ind, int[] dp, int zero, int one){
        if(ind==0){
            return 1;
        }
        if(ind<0){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int forZero=f(ind-zero, dp, zero, one);
        int forOne=f(ind-one, dp, zero, one);
        return dp[ind]=(forZero+forOne)%1_000_000_007;
    }
}
