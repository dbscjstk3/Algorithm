import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> pkm = new HashMap<>();
        
        for (int type : nums) {
            pkm.put(type, pkm.getOrDefault(type,0)+1);
        }
        
        int len = pkm.size();
        int ans = 0;
        if (len > nums.length/2) 
            ans = nums.length/2;
        else
            ans = len;
        
        return ans;
    }
}