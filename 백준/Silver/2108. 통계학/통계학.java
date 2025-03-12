import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	static int diff, max, min;
	static int[] count, nums;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = Integer.parseInt(br.readLine());
        nums = new int[N];
        double total = 0;
        max = Integer.MIN_VALUE; 
        min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
        	int num = Integer.parseInt(br.readLine());
        	nums[i] = num;
        	total += num;
        	max = Math.max(max, num);
        	min = Math.min(min, num);
        }
        diff = max - min;
        count = new int[diff+1];
        
        System.out.println(Math.round(total / N)); //산술평균
        
        Arrays.sort(nums);
        System.out.println(nums[N/2]); //중앙값
        
        System.out.println(findMode()); //최빈값
        
        System.out.println(diff); //최대-최소
    }
    
    static int findMode() {
    	Map<Integer, Integer> frequency = new HashMap<>();
    	int maxFrequency = 0;
    	
    	for (int num : nums) {
    		frequency.put(num, frequency.getOrDefault(num, 0)+1);
    		maxFrequency = Math.max(maxFrequency, frequency.get(num));
    	}
    	
    	List<Integer> modes = new ArrayList<>();
    	for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
    		if (entry.getValue() == maxFrequency) {
    			modes.add(entry.getKey());
    		}
    	}
    	
    	Collections.sort(modes);
    	
    	if (modes.size() != 1) return modes.get(1);
    	
    	return modes.get(0);
    }
}