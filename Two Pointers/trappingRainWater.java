// Problem: 42. Trapping Rain Water

class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1,ans=0;
        int lmax=Integer.MIN_VALUE;
        int rmax=Integer.MIN_VALUE;
        while(left<right){
            lmax=Math.max(lmax,height[left]);
            rmax=Math.max(rmax,height[right]);
            ans+=(lmax<rmax)?lmax-height[left++] : rmax-height[right--];
        }
        return ans;
    }
}
