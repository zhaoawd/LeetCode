package Array;

import java.util.HashMap;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(count.containsKey(nums[i])) {
                count.put(nums[i], count.get(nums[i]) +1);
                if(i>nums.length/2 && count.get(nums[i])>nums.length/2){
                    return nums[i];
                }
            } else {
                count.put(nums[i], 1);
            }
        }
        //单个元素才会走这里
        return nums[0];
    }

}
