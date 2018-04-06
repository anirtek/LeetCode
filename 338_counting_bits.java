class Solution {
    public int[] countBits(int num) {
        int[] bits = new int[num + 1];
        while(num >= 0) {
            bits[num] = bitCount(num);
            num -= 1;
        }
        return bits;
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
}
