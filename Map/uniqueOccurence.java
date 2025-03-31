import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> occuerance = new HashSet<>();

        // Count occurrences of each number
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check if all frequencies are unique
        for (int freq : map.values()) {
            if (!occuerance.add(freq)) { // If duplicate frequency found, return false
                return false;
            }
        }

        return true; // All frequencies are unique
    }
}