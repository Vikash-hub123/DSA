class Solution {
    public int maxJump(int[] stones) {
        int n=stones.length;
        int maxjump= stones[1] - stones[0];
        for(int i=2; i<n; i++){
             maxjump=Math.max(maxjump, stones[i] - stones[i-2]);
        }
        return maxjump;
        
    }
}