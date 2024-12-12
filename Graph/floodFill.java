package Graph;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        int currentColor = image[sr][sc];

        if (currentColor != newColor) {
            dfs(image, sr, sc, currentColor, visited, newColor);
        }

        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int currentColor, boolean[][] visited, int newColor) {
       
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }
        if (visited[sr][sc] || image[sr][sc] != currentColor) {
            return;
        }

        visited[sr][sc] = true;
        image[sr][sc] = newColor;
        dfs(image, sr + 1, sc, currentColor, visited, newColor);
        dfs(image, sr - 1, sc, currentColor, visited, newColor);
        dfs(image, sr, sc + 1, currentColor, visited, newColor);
        dfs(image, sr, sc - 1, currentColor, visited, newColor);
    }
}
