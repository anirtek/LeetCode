class Solution {
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        
        int jewels = 0;
        for (int i = 0; i < J.length(); i++) {
            char c = J.charAt(i);
            if (map.containsKey(c)) {
                jewels += map.get(c);
            }
        }
        
        return jewels;
    }
}