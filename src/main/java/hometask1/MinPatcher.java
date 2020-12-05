package hometask1;

public class MinPatcher {
    private static int i;
    private static int result;
    private static int edit = 1;
        public static int minPatches(int[] nums, int n){
        while(edit <= n){
            if (i < nums.length && nums[i] <= edit){
                edit += nums[i++];
            } else {
                edit += edit;
                result++;
            }
        }
        return result;
    }
}
