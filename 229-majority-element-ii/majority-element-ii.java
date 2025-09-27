import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0, count2 = 0;
        int el1 = 0, el2 = 0;
        for (int num : nums) {
            if (el1 == num) {
                count1++;
            } else if (el2 == num) {
                count2++;
            } else if (count1 == 0) {
                el1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                el2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == el1) count1++;
            else if (num == el2) count2++;
        }
        List<Integer> res = new ArrayList<>();
        if (count1 > n/3) res.add(el1);
        if (count2 > n/3) res.add(el2);

        return res;
    }
}
