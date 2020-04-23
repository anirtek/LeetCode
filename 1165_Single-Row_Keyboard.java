class Solution {
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> keyLocMap = new HashMap<>();
        for (int i = 0; i < keyboard.length(); i++) {
            keyLocMap.put(keyboard.charAt(i), i);
        }
        
        int prevLoc = 0;
        int time = 0;
        for (int i = 0; i < word.length(); i++) {
            int currLoc = keyLocMap.get(word.charAt(i));
            time += Math.abs(currLoc - prevLoc);
            prevLoc = currLoc;
        }
        return time;
    }
}