class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int temp = 0;
        for(int i = 0,j = A.length - 1 ; i < j; i++){
            if(A[i] % 2 != 0){
                while(A[j] % 2 != 0 && j > 0){
                    j--;
                }
                if( j > i){
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                } else {
                    return A;
                }
            }
        }
        return A;
    }
}