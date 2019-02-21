package Array;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            } else if ((i + 1 <= nums.length - 1) && (target <= nums[i + 1])) {
                return i + 1;
            }
        }
        return nums.length;
    }
}