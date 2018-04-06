class Solution {
    public int totalHammingDistance(int[] nums) {
        int count = 0;
        int[] oneBitCounter = new int[32];
        
        for(int i = 0; i < nums.length; i++) {
            int j = 0;
            while(nums[i] > 0) {
                if(nums[i] % 2 == 1) {
                    oneBitCounter[j] += 1;
                }
                nums[i] >>= 1;
                j++;
            }
        }
        
        for(int k = 0; k < 32; k++) {
            count += oneBitCounter[k] * (nums.length - oneBitCounter[k]);
        }
        return count;
    }
}