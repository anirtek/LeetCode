class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }
        int[] result = new int[len];
        for (int i = 0, index = 0; i < nums.length - 1; i += 2) {
            Arrays.fill(result, index, index + nums[i], nums[i+1]);
            index += nums[i];
        }
        
        return result;
    }
}