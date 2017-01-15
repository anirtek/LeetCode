package maximum.cosecutive.ones;

public class MaximumCosecutiveOnes {

    public static void main(String[] args) {
        MaximumCosecutiveOnes m = new MaximumCosecutiveOnes();
        int[] nums = {1,0,1,1,0,1};
        System.out.println(m.findMaxConsecutiveOnes(nums));
    }
    int index = 0;
    public int findMaxConsecutiveOnes(int[] nums) {
        int total = getTotal(nums);
        int differece = setDifference(nums.length, total);
        int max = getCountOfOne(nums);
        for (int i = 0; i < differece; i++) {
            int secondMax = getCountOfOne(nums);
            if(max <= secondMax)
                max = secondMax;
        }
        return max;
    }

    private int getTotal(int[] nums) {
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            t = t + nums[i];
        }
        return t;
    }

    private int setDifference(int length, int total) {
        return Math.abs(length - total);
    }

    private int getCountOfOne(int[] nums) {
        int count = 0;
        if (index <= nums.length) {
            for (int i = index; i < nums.length; i++) {
                if (nums[i] == 1) {
                    count++;
                } else {
                    index = i+1;
                    break;
                }
            }
        }
        return count;
    }
}
