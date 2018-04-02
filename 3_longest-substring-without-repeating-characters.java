class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        } else {
        int currLen = 1;
        int maxLen = 1;
        HashMap<Character, Integer> charMap = new HashMap<>();
        charMap.put(s.charAt(0), 0);
        int prev = -1;
        
        for(int i = 1; i < s.length(); i++) {
            if(charMap.containsKey(s.charAt(i))) {
                prev = charMap.get(s.charAt(i));
                charMap.put(s.charAt(i), i);
            } else {
                charMap.put(s.charAt(i), i);
                prev = -1;
            }
            
            if(prev == -1 || i - currLen > prev) {
                currLen += 1;
            } else {
                if(currLen > maxLen) {
                    maxLen = currLen;
                }
                currLen = i - prev;
            }
        }
        
        if(currLen > maxLen) {
            maxLen = currLen;
        }
        return maxLen;
    }
}
}
