import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        for (char key : map.keySet()) {
            if (map.get(key) == 1) 
                list.add(key);
        }
        
        Collections.sort(list);
        
        String ans = "";
        for (char c : list) {
            ans += c;
        }
        
        return ans;
    }
}