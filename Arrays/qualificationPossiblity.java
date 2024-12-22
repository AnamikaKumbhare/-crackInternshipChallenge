class Solution {
    public static boolean isPossible(String s) {
        int wins = 0;
        int n = s.length();
        int left = 14 - n;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                wins++;
            }
        }
        
        if (wins + left >= 8) {
            return true;
        }
        return false;
    }
}