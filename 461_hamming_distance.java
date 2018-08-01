class Solution {
    public int hammingDistance(int x, int y) {
        return bitCount(x^y);
    }
    
    int bitCount(int n) {
        int count = 0;
        while(n > 0) {
            if((n&1) != 0)
                count += 1;
            n >>= 1;
        }
        return count;
    }
    
}