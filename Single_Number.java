/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 */
object Solution {
    def singleNumber(nums: Array[Int]): Int = {
        var result: Int = 0
        for (each <- nums) {
            result ^= each
        }
        result
    }
}