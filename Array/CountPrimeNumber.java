package Array;

import java.util.Arrays;

public class CountPrimeNumber {

    public static int countPrimes(int n) {
        //埃拉托斯特尼筛法
        boolean[] toJudge = new boolean[n+1];
        for(int i=2; i< Math.round(Math.sqrt(n)+1);i++) {
            if(!toJudge[i]){
                for(int j = 2;j*i <= n; j++){
                    toJudge[j*i] = true;
                }
            }
        }
        int count = 0;
        for(int k = 2; k< n+1; k++) {
            if(!toJudge[k]) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Math.sqrt(10));
        System.out.println(Math.round(Math.sqrt(10)));
        System.out.println(countPrimes(3));
    }
}
