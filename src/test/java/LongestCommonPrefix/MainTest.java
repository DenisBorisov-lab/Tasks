package LongestCommonPrefix;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void WhenFirstTestThenFl(){
        Main go = new Main();
        String[] list = {"flower","flow","flight"};
        String answer = go.longestCommonPrefix(list);
        Assert.assertEquals("fl", answer);
    }
    @Test
    public void WhenFirstTestThenNothing(){
        Main go = new Main();
        String[] list = {"dog","racecar","car"};
        String answer = go.longestCommonPrefix(list);
        Assert.assertEquals("", answer);
    }


}