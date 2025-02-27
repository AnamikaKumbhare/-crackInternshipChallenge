package Hash;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> numSet=new HashSet<>();
        for(int num:arr){
            numSet.add(num);
        }
        int maxLen=0;
        for(int start=0;start<arr.length;start++){
            for(int next=start+1;next<arr.length;next++){
                int prev=arr[next];
                int curr=arr[start]+arr[next];
                int len=2;
                while(numSet.contains(curr)){
                    int temp=curr;
                    curr+=prev;
                    prev=temp;
                    maxLen=Math.max(maxLen, ++len);
                }
            }
        }
        return maxLen;
    }
}