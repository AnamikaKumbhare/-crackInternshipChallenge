package Strings;

import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].contains(words[j]) && i != j) {
                    if(!ans.contains(words[j])){
                        ans.add(words[j]);
                    }
                    
                }
            }
        }
        return ans;
    }
}
