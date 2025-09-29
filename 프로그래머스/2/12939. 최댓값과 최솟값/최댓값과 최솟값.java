public class Solution {
    public String solution(String s) {
        String answer = "";
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        String[] nums = s.split(" ");
        for (String num : nums) {
            int n = Integer.parseInt(num);
            if (n < min) min = n;
            if (n > max) max = n;
        }

        answer += min + " " + max;
        return answer;
    }
}
