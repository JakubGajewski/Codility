package lesson6_sorting;

import java.util.Arrays;

class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);
        long a;
        long b;
        long c;
        for (int i = 0; i < A.length-2; i++) {
            a = A[i];
            b = A[i+1];
            c = A[i+2];
            if ((a+b>c)&&(a+c>b)&&(b+c>a)) {
                return 1;
            }
        }
        return 0;
    }
}