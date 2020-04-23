/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * Example:
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */

 object Solution {
    def maxSubArray(nums: Array[Int]): Int = {
        var maxSum: Int = Integer.MIN_VALUE
        var sum = 0
        for (each <- nums) {
            sum += each
            maxSum = if (maxSum < sum) sum else maxSum
            sum = if (sum < 0) 0 else sum
        }
        maxSum
    }
}