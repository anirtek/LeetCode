class Solution {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for(; L <= R; L++) {
            int setBits = bitCount(L);
            if(isPrime(setBits)) {
                count += 1;
            }
        }
        return count;
    }
    
    int bitCount(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) {
                count += 1;
            }
            n >>= 1;
        }
        return count;
    }
    
    boolean isPrime(int m) {
        Set<Integer> set = new HashSet<Integer>(){{
            add(2); add(3); add(5); add(7); add(11); add(13);
            add(17); add(19); add(23); add(29); add(31); 
        }};
        
        if(set.contains(m))
            return true;
        else 
            return false;
    }
}