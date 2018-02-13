/**
 * 628. Maximum Product of Three Numbers
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
 * Note:
 *      1. The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
 *      2. Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 */
import java.util.Arrays;

public class MaxProductOfThreeNumbers {

    public static void main(String[] args) {
        int [] arr = {1, 4, 3, -6, -7, 0};
        System.out.println("Maximum Product = "+ maximumProduct(arr));
    }
    
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int firstTwoProduct = nums[0] * nums[1] * nums[nums.length-1];
        int lastThreeProduct = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        return Math.max(lastThreeProduct, firstTwoProduct);
    }
}
