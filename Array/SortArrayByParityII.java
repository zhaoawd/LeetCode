package Array;
class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        int odd_index = 1;
        int even_index = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 != 0){
                result[odd_index] = A[i];
                odd_index += 2;
            } else {
                result[even_index] = A[i];
                even_index += 2;
            }
        }
        return result;
    }
}