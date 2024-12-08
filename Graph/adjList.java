package Graph;
//import java.util.List;
import java.util.ArrayList;
class Solution {
    public ArrayList<ArrayList<Integer>> printGraph(int V, int edges[][]) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        return list;
    }
}
