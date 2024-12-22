package Graph;
import java.util.LinkedList;
import java.util.Queue;
class Node {
    int row;
    int col;
    int step;

    public Node(int row, int col, int step) {
        this.row = row;
        this.col = col;
        this.step = step;
    }
}

class Solution {
    public int[][] nearest(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] distance = new int[m][n];
        Queue<Node> queue = new LinkedList<>();
       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    queue.add(new Node(i, j, 0));
                    distance[i][j] = 0; 
                } else {
                    distance[i][j] = -1; 
                }
            }
        }
        
        int[] moveRow = {-1, 0, 1, 0};
        int[] moveCol = {0, -1, 0, 1};
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            int r = current.row;
            int c = current.col;
            int s = current.step;
            
            for (int i = 0; i < 4; i++) {
                int newRow = r + moveRow[i];
                int newCol = c + moveCol[i];
                
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && distance[newRow][newCol] == -1) {
                    distance[newRow][newCol] = s + 1; 
                    queue.add(new Node(newRow, newCol, s + 1)); 
                }
            }
        }
        
        return distance;
    }
}

