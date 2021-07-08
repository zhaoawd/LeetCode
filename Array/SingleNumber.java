package Array;

import java.util.*;

public class SingleNumber {

    public static int singleNumber_HashTable(int[] nums) {
        HashMap<Integer, Integer> abc = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (abc.containsKey(nums[i])) {
                abc.remove(nums[i]);
            } else {
                abc.put(nums[i], 0);
            }
        }
        for (Integer key:abc.keySet()){
            return key;
        }
        return 0;
    }

    // a XOR a= 0, a XOR 0 = a;
    public int singleNumber_Bit_Manipulation(int[] nums) {
        int single = 0;
        for (int i : nums) {
            single ^= i;
        }
        return single;
    }

    // 2*(a+b+c)−(a+a+b+b+c)=c
    public int singleNumber_Math(int[] nums) {
        int sumOfSet = 0;
        int sumOfNums = 0;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.contains(n)){
                set.add(n);
                sumOfNums += n;
            }
            sumOfNums += n;
        }

        return 2*sumOfSet - sumOfNums;
    }

    public int singleNumber_List_Operation(int[] nums) {
        List<Integer> no_duplicate_list = new ArrayList<>();

        for (int i : nums) {
            if (!no_duplicate_list.contains(i)) {
                no_duplicate_list.add(i);
            } else {
                no_duplicate_list.remove(new Integer(i));
            }
        }
        return no_duplicate_list.get(0);
    }
}
