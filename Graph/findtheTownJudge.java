package Graph;
import java.util.HashSet;
class findTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        if(n==1) return 1;
        HashSet<Integer> hs=new HashSet<>();
        for(int[] arr: trust){
            hs.add(arr[0]);
        }
        int ans=-1;
        for(int[] arr: trust){
            if(!hs.contains(arr[1])){
                ans=arr[1];
            }
        }
        if(ans==-1){
            return ans;
        }
        int count=0;
        for(int[] arr:trust){
            if(arr[1]==ans){
                count++;
            }
        }
        if(count>=n-1){
            return ans;
        }
        return -1;
    }
}
