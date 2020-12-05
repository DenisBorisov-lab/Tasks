package hometask1;

public class MinPatcher {
    private int i;
    private int result;
    private int edit = 1;
        public int minPatches(int[] nums, int n){
        while(edit <= n){
            if (i < nums.length && nums[i] <= edit){
                edit += nums[i + 1];
            } else {
                edit += edit;
                result++;
            }
        }
        return result;
    }
}
