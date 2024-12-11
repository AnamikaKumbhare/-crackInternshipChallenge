package Graph;
import java.util.ArrayList;
public class noOfProvinces {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // Convert adjacency matrix to adjacency list
        ArrayList<ArrayList<Integer>> adjls = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjls.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adj.get(i).get(j) == 1 && i != j) {
                    adjls.get(i).add(j);
                    adjls.get(j).add(i);
                }
            }
        }

        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                count++;
                dfs(adjls, visited, i);
            }
        }
        return count;
    }

    static void dfs(ArrayList<ArrayList<Integer>> adjls, boolean[] visited, int curr) {
        visited[curr] = true;
        for (int node : adjls.get(curr)) {
            if (!visited[node]) {
                dfs(adjls, visited, node);
            }
        }
    }
}
