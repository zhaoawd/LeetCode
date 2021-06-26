package Array;

public class PlusOne {

    public int[] plusOne_1(int[] digits) {
        for(int i=digits.length-1; i>=0; i--) {
            if(digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else if(i == 0) {
                digits[i] = 0;
                int[] plusResult = new int[digits.length+1];
                plusResult[0] = 1;
                for(int j = 1; j<plusResult.length-1 ;j++){
                    plusResult[j] = digits[j-1];
                }
                return plusResult;
            } else {
                digits[i] = 0;
            }
        }
        return digits;
    }
}