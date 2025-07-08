import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int successCount = 0;
        int lastAttack = attacks[attacks.length-1][0];
        int time = 1;
        int answer = 0;
        Map<Integer, Integer> attackInfo = new HashMap<>();

        for (int[] attack : attacks) {
            attackInfo.put(attack[0], attack[1]);
        }

        while (time <= lastAttack) {
            if (attackInfo.containsKey(time)) {
                health -= attackInfo.get(time);
                if (health <= 0) {
                    answer = -1;
                    return answer;
                }
                successCount = 0;
            } else {
                health += bandage[1];
                successCount++;
                if (successCount == bandage[0]) {
                    health += bandage[2];
                    successCount = 0;
                }
                
                if (health > maxHealth) 
                    health = maxHealth;
            }

            time++;
        }

        answer = health;
        return answer;
    }
}
