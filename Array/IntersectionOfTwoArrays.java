package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> intersection = new HashMap<>();
        if(nums1.length<nums2.length) {
            for(int i: nums1) {
                intersection.put(i,0);
            }
            for(int j: nums2) {
                if(intersection.containsKey(j)) {
                    intersection.put(j,1);
                }
            }
        } else {
            for(int i: nums2) {
                intersection.put(i,0);
            }
            for(int j: nums1) {
                if(intersection.containsKey(j)) {
                    intersection.put(j,1);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int key: intersection.keySet()) {
            if(intersection.get(key) == 1) {
                result.add(key);
            }
        }
        return result.stream().mapToInt(x->x).toArray();
    }
}
