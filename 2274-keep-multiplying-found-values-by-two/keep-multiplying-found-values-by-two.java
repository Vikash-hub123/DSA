class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n= nums.length;
        HashSet<Integer> Set = new HashSet<>();
        for(int x:nums){
            Set.add(x);
        }
        while(Set.contains(original)){
            original = original*2;
        }
        return original;
        
    }
}