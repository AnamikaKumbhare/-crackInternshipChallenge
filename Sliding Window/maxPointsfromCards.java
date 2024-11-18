class Solution {
    public int maxScore(int[] cardPoints, int k) {
        //initializing sum of window
        int start=0, end=k, sum=0, n=cardPoints.length;
        for(int i=start;i<end;i++){
            sum+=cardPoints[i];
        }
        //sliding the window
        int max=sum;
        for(int i=0;i<k;i++){
            sum=sum-cardPoints[k-i-1]+cardPoints[n-i-1];
            max=Math.max(max,sum);
        }
        return max;
    }
}
