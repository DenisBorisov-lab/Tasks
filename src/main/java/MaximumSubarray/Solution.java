package MaximumSubarray;

public class Solution {
    public static int maxSubArray(int[] nums){
        int maxTarget = nums[0];
        int maxGlobal = nums[0];
        for (int i = 1; i < nums.length; i++){
            maxTarget = Math.max(nums[i], maxTarget + nums[i]);
            if (maxTarget > maxGlobal){
                maxGlobal = maxTarget;
            }
        }
        return maxGlobal;
    }
}
