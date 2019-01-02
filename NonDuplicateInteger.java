/**
 * Given an array of integers where every integer occurs three times except 
 * for one integer, which only occurs once, find and return the 
 * non-duplicated integer.
 * For example, given [6, 1, 3, 3, 3, 6, 6], return 1. 
 *              given [13, 19, 13, 13], return 19.
 * Do this in O(N) time and O(1) space.
 */

public class NonDuplicateInteger {
    public int findNonDuplicateInTriplets(int[] nums) {
        if(nums.length == 0 || nums == null)
            return 0;
        int ones = 0;
        int twos = 0;
        int nonThrees;

        for(int x: nums) {
            tows |= ones & x;
            ones ^= x;
            nonThrees = ~(ones & twos);
            ones &= nonThrees;
            twos &= nonThrees;
        }
        return ones;
    }
}
