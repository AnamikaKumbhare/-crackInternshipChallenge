package Graph;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[V];
        ArrayList<Integer> ans=new ArrayList<>();
        if(V!=0) q.add(0);
        while(!q.isEmpty()){
            int curr=q.poll();
            ans.add(curr);
            visited[curr]=true;
            for(int neighbour:adj.get(curr)){
                if(!visited[neighbour]){
                    q.add(neighbour);
                    visited[neighbour]=true;
                }
            }
        }
        return ans;
    }
}
