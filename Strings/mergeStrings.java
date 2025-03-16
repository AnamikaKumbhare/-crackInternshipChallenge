package Strings;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        
        StringBuilder sb = new StringBuilder();
        int ind = 0;
        
        while (ind < n1 && ind < n2) {
            sb.append(word1.charAt(ind));
            sb.append(word2.charAt(ind));
            ind++;
        }
        
        if (ind < n1) {
            sb.append(word1.substring(ind));
        }
        
        if (ind < n2) {
            sb.append(word2.substring(ind));
        }
        
        return sb.toString();
    }
}

