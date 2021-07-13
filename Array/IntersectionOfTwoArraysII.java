package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums1){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        for(int j=0; j< nums2.length; j++){
            if(map.containsKey(nums2[j]) && map.get(nums2[j]) > 0){
                result.add(nums2[j]);
                map.put(nums2[j], map.get(nums2[j]) - 1);
            }
        }
        return result.stream().mapToInt(x->x).toArray();
    }
}
