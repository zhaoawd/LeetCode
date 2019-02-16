import java.util.Arrays;
class SquaresOfASortedArray {
    //Arrays.sort 是快速排序
    public int[] sortedSquares_V1(int[] A) {
        for(int i = 0 ; i<A.length; i++){
            A[i]=Math.abs(A[i]);
        }
        Arrays.sort(A, 0,A.length);
        for(int j = 0 ; j < A.length; j++){
            A[j]= A[j] * A[j];
        }
        return A;
    }

    public int[] sortedSquares_V2(int[] A) {
        for(int j = 0 ; j < A.length; j++){
            A[j]= A[j] * A[j];
        }
        Arrays.sort(A, 0,A.length);

        return A;
    }
}