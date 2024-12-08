package Graph;

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()]; // Fix here: use adj.size()
        dfs(adj, ans, visited, 0); // Start DFS from the first node (assumes 0-based indexing)
        return ans;
    }

    public void dfs(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, boolean[] visited, int node) {
        visited[node] = true;
        ans.add(node);
        for (int neighbour : adj.get(node)) {
            if (!visited[neighbour]) {
                dfs(adj, ans, visited, neighbour);
            }
        }
    }
}
