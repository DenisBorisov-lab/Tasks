package MaximumSubarray;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void whenFirstArrayThenSix(){
        Solution go = new Solution();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int answer = go.maxSubArray(nums);
        Assert.assertEquals(6, answer);
    }
    @Test
    public void whenSecondArrayThenOne(){
        Solution go = new Solution();
        int[] nums = {1};
        int answer = go.maxSubArray(nums);
        Assert.assertEquals(1, answer);
    }
    @Test
    public void whenThirdArrayThenNull(){
        Solution go = new Solution();
        int[] nums = {0};
        int answer = go.maxSubArray(nums);
        Assert.assertEquals(0, answer);
    }
    @Test
    public void whenFourthArrayThenNegativeOne(){
        Solution go = new Solution();
        int[] nums = {-1};
        int answer = go.maxSubArray(nums);
        Assert.assertEquals(-1, answer);
    }
    @Test
    public void whenFifthArrayThenBigNumber(){
        Solution go = new Solution();
        int[] nums = {-2147483647};
        int answer = go.maxSubArray(nums);
        Assert.assertEquals(-2147483647, answer);
    }


}