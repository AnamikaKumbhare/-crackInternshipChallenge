import java.util.ArrayList;

public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        return new int[] {firstoccr(arr, n, k), lastoccr(arr, n, k)};
    }

    public static int firstoccr(ArrayList<Integer> arr, int n, int k) {
        int left = 0, right = n - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == k) {
                ans = mid;
                right = mid - 1;
            } else if (arr.get(mid) > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static int lastoccr(ArrayList<Integer> arr, int n, int k) {
        int left = 0, right = n - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == k) {
                ans = mid;
                left = mid + 1;
            } else if (arr.get(mid) > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
