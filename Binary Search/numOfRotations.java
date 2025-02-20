class Solution {
    public static int findKRotation(int[] arr) {
        int left = 0, right = arr.length - 1;
        int minIndex = -1;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                minIndex = left;
                break;
            }

            int mid = left + (right - left) / 2;

            if (arr[mid] <= arr[(mid - 1 + arr.length) % arr.length] &&
                arr[mid] <= arr[(mid + 1) % arr.length]) {
                minIndex = mid;
                break;
            }

            if (arr[left] <= arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return minIndex;
    }
}
