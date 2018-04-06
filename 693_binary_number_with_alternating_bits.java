class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n < 0) return false;
        
        /* Get the first bit */
        int status = (n&1);
        n >>= 1;
        
        /* Go on checking each bit of n while n exists */
        while(n > 0) {
            if((n&1) == 0) {
                if(status == 1) status = 0;
                else return false;
            } else if((n&1) == 1){
                if(status == 0) status = 1;
                else return false;
            }
            n >>= 1;
        }
        return true;
    }
}