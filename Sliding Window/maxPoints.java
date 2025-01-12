class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int end=k, sum=0;
        for(int i=0;i<end;i++){
            sum+=cardPoints[i];
        }
        int max=sum;
        for(int i=0;i<k;i++){
            sum+=cardPoints[cardPoints.length-i-1]-cardPoints[k-i-1];
            max=Math.max(max, sum);
        }
        return max;
    }
}