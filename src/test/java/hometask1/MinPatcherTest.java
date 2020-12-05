package hometask1;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MinPatcherTest{

    @Test
    public void minPatcherFirstTest(){
        MinPatcher go = new MinPatcher();
        int[] value = {1, 3};
        int answer = go.minPatches(value, 6);
        Assert.assertEquals(1, answer);
    }
    @Test
    public void minPatcherSecondTest(){
        MinPatcher go = new MinPatcher();
        int[] value = {1, 5, 10};
        int answer = go.minPatches(value, 20);
        Assert.assertEquals(2, answer);
    }
    @Test
    public void minPatcherThirdTest(){
        MinPatcher go = new MinPatcher();
        int[] value = {1, 2, 2};
        int answer = go.minPatches(value, 5);
        Assert.assertEquals(0, answer);
    }


}