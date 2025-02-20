import java.util.ArrayList;
class Solution {
    public static int search(ArrayList<Integer> arr, int n, int target) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == target) {
                return mid;
            }
            if (arr.get(left) <= arr.get(mid)) {
                if (arr.get(left) <= target && target <= arr.get(mid)) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (arr.get(mid) <= target && target <= arr.get(right)) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
