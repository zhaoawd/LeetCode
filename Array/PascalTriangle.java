package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate_1(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int index = 1;
        ArrayList<Integer> allNums = new ArrayList<>(numRows*(numRows+1)/2);
        while(index <= numRows) {
            ArrayList<Integer> single = new ArrayList<>();
            int now = index*(index-1)/2;
            if(index == 1) {
                allNums.add(1);
            } else if (index == 2) {
                allNums.add(1);
                allNums.add(1);
            } else if(index%2==0) {
                allNums.add(1);
                for(int i=1; i < index/2; i++){
                    allNums.add(allNums.get(now - index + i+1) + allNums.get(now - index + i+2));
                }
                for (int j = index/2; j<=index-1; j++) {
                    allNums.add(allNums.get(now + index - (j+1)));
                }
            }
            else if(index%2!=0) {
                allNums.add(1);
                for(int i=1; i <= index/2; i++){
                    allNums.add(allNums.get(now - index + i) + allNums.get(now - index + i+1));
                }
                for (int j = index/2+1; j<=index-1; j++) {
                    allNums.add(allNums.get(now + index - (j+1)));
                }
            }
            single.addAll(allNums.subList(now, now + index));
            result.add(single);
            index++;
        }
        return result;
    }

    public static List<List<Integer>> generate_2(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            Integer[] singleRow = new Integer[i+1];
            singleRow[0] = 1;
            singleRow[i] = 1;
            for (int j = 1; j < i; j++) {
                singleRow[j] = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
            }
            result.add(Arrays.asList(singleRow));
        }
        return result;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<List<Integer>> row = generate_1(5);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(5*6/2);
    }
}
