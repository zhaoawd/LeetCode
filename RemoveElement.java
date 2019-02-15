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

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,2};
        int val = 2;
        int result = RemoveElement.removeElement(arr, val);
        System.out.print(result);
    }
}