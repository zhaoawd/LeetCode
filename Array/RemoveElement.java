package Array;

public class RemoveElement {

    public static int removeElement(int[] nums, int val){
        int length = nums.length;
        int jump = 0;
        for (int i = 0; i + jump < length; ) {
            while( nums[i] == val ){
                jump++;
            }
            nums[i]= nums[i+jump];
        }
        return nums.length;
    }
}