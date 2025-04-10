import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int[] ans = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                ans[i] = -1;
                map.put(ch, i);
            }
            else {
                ans[i] = i - map.get(ch);
                map.put(ch, i);
            }
        }
        
        return ans;
    }
}