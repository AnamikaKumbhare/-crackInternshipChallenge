package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 2) {
                    queue.add(new int[]{i, j}); 
                } else if (mat[i][j] == 1) {
                    freshOranges++; 
                }
            }
        }

        if (freshOranges == 0) return 0;

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int minutes = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false; 

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0], col = current[1];

                for (int[] dir : directions) {
                    int newRow = row + dir[0], newCol = col + dir[1];

                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && mat[newRow][newCol] == 1) {
                        mat[newRow][newCol] = 2;
                        queue.add(new int[]{newRow, newCol}); 
                        freshOranges--; 
                        rotted = true; 
                    }
                }
            }

            if (rotted) minutes++;
        }

        return freshOranges == 0 ? minutes : -1;
    }
}

