class Solution {
    public int solution(int[][] sizes) {
        int maxHeight = -1;
        int maxWidth = -1;
        int ans = 0;
        
        for (int[] size : sizes) {
            if (size[0] < size[1]) {
                int tmp = size[1];
                size[1] = size[0];
                size[0] = tmp;
            }
            
            if (size[0] > maxHeight) {
                maxHeight = size[0];
            }
            
            if (size[1] > maxWidth) {
                maxWidth = size[1];
            }
        }
        
        return maxHeight * maxWidth;
        
    }
}