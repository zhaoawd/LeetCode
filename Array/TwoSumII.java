package Array;

public class TwoSumII {
    //左右逼近
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while( numbers[left] + numbers[right] != target && left < right) {
            if(numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }

        }
        int[] result = {left+1, right+1};
        return result;
    }
}
