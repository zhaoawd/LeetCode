public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int now = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == now) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
            if (0 < result[1]) {
                break;
            }
        }
        return result;
    }
}