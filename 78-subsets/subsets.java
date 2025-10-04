import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for(int num : nums){
            int size = result.size();
            for(int i=0; i<size;i++){
             List<Integer> ans =  new ArrayList<>(result.get(i));
            ans.add(num);
            result.add(ans);
            }
            
        }
        return result;
    }
}
