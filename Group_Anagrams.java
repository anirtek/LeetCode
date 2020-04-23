class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<Integer, List<String>> map = new HashMap<>();
        int[] primes = {
            2, 3, 5, 7, 
            11, 13, 17, 19, 
            23, 29, 
            31, 37, 
            41, 43, 47, 
            53, 59, 
            61, 67, 
            71, 73, 79, 
            83, 89, 
            97, 
            101
        };
        for (String each: strs) {
            int score = getScoreIndex(each, primes);
            List<String> list = map.get(score);
            if (list == null) {
                list = new ArrayList<>();
                map.put(score, list);
                result.add(list);
            }
            list.add(each);
        }
        
        return result;
    }
    
    private int getScoreIndex(String s, int[] primes) {
        int score = 1;
        for (char c: s.toCharArray()) score *= primes[c-'a'];
        return score;
    }
}