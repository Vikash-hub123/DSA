class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] count = new int[51];
        int ans = 0;
        for (int x : nums) {
            count[x]++;
            if (count[x] == 2) {
                ans ^= x;
            }
        }
        return ans;
    }
}
