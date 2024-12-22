package Graph;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;
class Solution {
    public boolean isBipartite(ArrayList<ArrayList<Integer>> adj) {
        int[] color = new int[adj.size()];
        int v = adj.size();
        Arrays.fill(color, -1);

        for (int i = 0; i < v; i++) {
            if (color[i] == -1) { 
                if (!check(i, adj, color)) { 
                    return false;
                }
            }
        }
        return true;
    }

    public boolean check(int start, ArrayList<ArrayList<Integer>> adj, int[] color) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        color[start] = 0; 

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : adj.get(node)) {
                if (color[neighbor] == -1) { 
                    color[neighbor] = 1 - color[node]; 
                    queue.add(neighbor);
                } else if (color[neighbor] == color[node]) { 
                    return false;
                }
            }
        }
        return true; 
    }
}
