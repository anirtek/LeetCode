public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        //long num = Long.valueOf(n);
        int rev = 0 ;
        //while(num > 0) {
        for(int i = 0; i < 32; i++) {
            rev <<= 1;
            if((n & (1 << i)) != 0)
               rev ^= 1;
        }
        return rev;
    }
}