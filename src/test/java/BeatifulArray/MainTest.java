package BeatifulArray;


import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class MainTest{
    @Test
    public void WhenFour(){
        Main go = new Main();
        int n = 4;
        ArrayList<Integer> number = go.beautifulArray(n);
        Assert.assertTrue(forTest(number));
    }
    @Test
    public void WhenFive(){
        Main go = new Main();
        int n = 5;
        ArrayList<Integer> number = go.beautifulArray(n);
        Assert.assertTrue(forTest(number));
    }
    public boolean forTest(ArrayList<Integer> number){
        boolean answer = true;
        for (int i = 1; i < number.size() - 1; i++){
            if (number.get(i) * 2 == number.get(i - 1) + number.get(i + 1)){
                answer = false;
            }
        }
        return answer;
    }
}