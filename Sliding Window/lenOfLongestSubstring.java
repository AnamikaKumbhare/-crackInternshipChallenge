import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s == null) {
            return 0;
        }
        HashSet<Character> hs = new HashSet<>();
        int maxlen=0, start=0;
        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);
            while(hs.contains(ch)){
                hs.remove(s.charAt(start));
                start++;
            }
            hs.add(ch);
        maxlen = Math.max(maxlen, end - start + 1);
        }
        return maxlen;
    }
}