package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MajorityElementII {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> aboveThird = new ArrayList<>();
        if(nums.length < 3) {
            if(nums.length == 2 && nums[0] == nums[1]) {
                aboveThird.add(nums[0]);
                return aboveThird;
            }
            return Arrays.stream(nums).boxed().collect(Collectors.toList());
        }
        int third = nums.length/3;
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(count.containsKey(nums[i])) {
                count.put(nums[i], count.get(nums[i]) + 1);
                if(count.get(nums[i]) > third && !aboveThird.contains(nums[i])){
                    aboveThird.add(nums[i]);
                    if(aboveThird.size()==2) {
                        return aboveThird;
                    }
                }
            } else {
                count.put(nums[i], 1);
            }
        }
        return aboveThird;
    }

}
