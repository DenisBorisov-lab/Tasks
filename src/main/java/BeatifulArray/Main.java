package BeatifulArray;

import java.util.ArrayList;

public class Main {
    public ArrayList<Integer> beautifulArray(int n){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        while (numbers.size() < n) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int i : numbers) {
                int value = i * 2 - 1;
                if (value <= n) {
                    temp.add(value);
                }
            }
            for (int i : numbers) {
                int res = i * 2;
                if (res <= n) {
                    temp.add(i * 2);
                }
            }
            numbers = temp;
        }
        return numbers;
    }
}
