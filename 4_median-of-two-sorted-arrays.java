class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)  {
        int len1 = nums1.length, len2 = nums2.length; 
        int[] nums;
        // 1. MERGE TWO ARRAYS FIRST
        if(len1 >= len2) {
            nums = merge(nums1, len1, nums2, len2);
        } else {
            nums = merge(nums2, len2, nums1, len1);
        }
        // 2. FIND THE MIDDLE
        if(nums.length % 2 == 1) {
            return (nums[nums.length/2] / 1.0);
        } else {
            int mid = nums.length / 2;
            return ((nums[mid] + nums[mid-1]) /2.0);
        }
    }
    
    int[] merge(int[] first, int l1, int[] second, int l2) {
        int[] nums = new int[l1+l2];
        int countFirst = 0;
        int countSecond = 0;
        int index = 0;
        while(index < l1+l2) {
            if(countFirst < l1 && countSecond < l2) {
                if(first[countFirst] < second[countSecond]) {
                    nums[index] = first[countFirst++];          
                } else if(first[countFirst] >= second[countSecond]) {
                    nums[index] = second[countSecond++];
                }
            } else {
                if(countFirst == l1 && countSecond < l2) {
                    nums[index] = second[countSecond++];
                } else if(countFirst < l1 && countSecond == l2) {
                    nums[index] = first[countFirst++];
                }
            }
            index += 1;
        }
        return nums;
    }
}
