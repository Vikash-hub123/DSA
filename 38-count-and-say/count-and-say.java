class Solution {
    public String countAndSay(int n) {
        if (n <= 0) return "";
        String res = "1";
        for (int i = 2; i <= n; i++) {
            res = nextSequence(res);
        }
        return res;
    }
    private String nextSequence(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prev = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == prev) {
                count++;
            } else {
                sb.append(count).append(prev);
                prev = c;
                count = 1;
            }
        }
        sb.append(count).append(prev);
        return sb.toString();
    }
}
