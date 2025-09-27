class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        int fre = -1;       // answer
        int maxFreq = 0;    // max frequency

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) continue;  // odd skip

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            // update condition
            if (count > maxFreq || (count == maxFreq && nums[i] < fre)) {
                maxFreq = count;
                fre = nums[i];
            }
        }

        return fre;
    }
}
