class Solution {
    public int jump(int[] nums) {
        int currentReach= 0;
        int jumps=0;
        int maxReach=0;
        int n=nums.length;
        for(int i=0; i<n-1; i++){
            if(i+nums[i] > maxReach){
                maxReach = i + nums[i];
            }
            if(i == currentReach){
                jumps++;
                currentReach = maxReach;
            }
        }
        return jumps;
        
        
    }
}