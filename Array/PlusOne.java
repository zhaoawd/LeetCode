package Array;

public class PlusOne {

    public int[] plusOne(int[] digits){
        int val = 0;
        
        val++;
        String[] newVal = String.valueOf(val).split("");
        digits = new int[newVal.length];
        for (int i = 0; i < newVal.length; i++) {
            digits[i] = Integer.parseInt(newVal[i]);
        }
        return digits;
    }
}