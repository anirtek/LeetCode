class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] result = new int[nums.length];
        
        // count all the numbers
        for (int n: nums) count[n] += 1;
        // get count of all smaller numbers
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        
        // add smaller count into the result array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) 
                result[i] = 0;
            else 
                result[i] = count[nums[i] - 1];
        }
        
        return result;
    }
}