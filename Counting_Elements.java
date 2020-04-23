class Solution {
    public int countElements(int[] arr) {
        int maxCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer each: arr) {
            if (map.containsKey(each)) {
                int tempCount = map.get(each); 
                map.put(each, tempCount + 1); 
            } else { 
                map.put(each, 1); 
            } 
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int currKey = entry.getKey(); 
            if (map.containsKey(currKey + 1)) {
                maxCount += map.get(currKey);
            }
        }
        
        return maxCount;
    }
}