package lesson6_sorting;

import java.util.Arrays;

public class MaxProdutOfThree {
    class Solution {
        public int solution(int[] A) {
            Arrays.sort(A);
            int max = A[A.length-3]*A[A.length-2]*A[A.length-1];
            if (A[0]*A[1]*A[(A.length-1)] > max) {
                max = A[0]*A[1]*A[(A.length-1)];
            }
            return max;
        }
    }
}
