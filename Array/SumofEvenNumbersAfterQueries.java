package Array;

public class SumofEvenNumbersAfterQueries {
    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int answer = 0;
        int[] result = new int[A.length];
        for(int n=0; n < A.length; n++){
            if( Math.abs(A[n])  % 2 == 0){
                answer += A[n];
            }
        }
        for(int i=0; i < queries.length; i++){
            int add_one = A[queries[i][1]];
            int add_two = queries[i][0];
            A[queries[i][1]] = add_one + add_two;
            if ( Math.abs( add_one) % 2 == 0) {
                if( Math.abs( add_two) % 2 == 0){
                    answer += add_two;
                } else {
                    answer = answer - add_one;
                }
            } else if (Math.abs( add_one) % 2 != 0 && Math.abs(add_two) % 2 != 0) {
                answer += A[queries[i][1]];
            }
            result[i] = answer;
        }
        return result;
    }
}