package hometask1;

public class MinPatcher {
    private int i;
    private int result;
    private int edit = 1;//минимальная сумма среди элементов [0, n]
        public int minPatches(int[] nums, int n){
        while(edit <= n){
            if (i < nums.length && nums[i] <= edit){//если есть такое число которое меньше edit в последовательности то мыдолжны добавить его к сумме чтобы выстроить последовательность с максимальным количеством элементов
                edit += nums[i++];
            } else {//если такго числа нет, то мы должны его добавить и поаторить алгоритм
                edit += edit;
                result++;
            }
        }
        return result;
    }
}
