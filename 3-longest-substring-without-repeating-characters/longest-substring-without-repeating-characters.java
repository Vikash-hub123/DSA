class Solution {
    //vikash
    public int lengthOfLongestSubstring(String s) {
                int start = 0, end = 0, max_length = 0;
        List<Character> list = new ArrayList<>();

        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {  
                list.add(s.charAt(end));
                end++;
                max_length = Math.max(max_length, list.size());
            } else {  
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
    }
}
        
    
