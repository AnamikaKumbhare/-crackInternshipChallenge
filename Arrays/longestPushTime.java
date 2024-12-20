package Arrays;

class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int ind = events[0][0]; 
        int longestTime = events[0][1]; 

        for (int i = 1; i < events.length; i++) {
            int currDiff = events[i][1] - events[i - 1][1];

            if (currDiff > longestTime || (currDiff == longestTime && events[i][0] < ind)) {
                longestTime = currDiff;
                ind = events[i][0];
            }
        }

        return ind;
    }
}

