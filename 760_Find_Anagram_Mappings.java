class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            indexMap.put(B[i], i);
        }
        
        for (int i = 0; i < A.length; i++) {
            if (indexMap.containsKey(A[i])) {
                B[i] = indexMap.get(A[i]);
            }
        }
        return B;
    }
}