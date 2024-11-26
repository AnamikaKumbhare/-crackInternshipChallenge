import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        if (arr == null || arr.size() < m) {
            return -1;
        }
        Collections.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.size() - m; i++) {
            int diff = arr.get(i + m - 1) - arr.get(i);
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}