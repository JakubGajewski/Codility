package lesson3_time_complexity;
//Score: 100%


class PermMissingElement {
    public int solution(int[] A) {

        boolean[] B = new boolean[A.length + 2];

        for (int i = 0; i < A.length; i++) {
            int valueAtIndexI = A[i];
            B[valueAtIndexI] = true;
        }

        for (int i = 1; i < B.length; i++) {
            if (!B[i]) {
                return i;
            }
        }
        return -1;
    }
}


/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class PermMissingElement {
    public int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }
        Arrays.sort(A);
        for  (int i = 1; i<=A.length; i++) {
            if (i != A[i-1]) {
                return i;
            }
        }
        return A[A.length-1]+1;
    }
}
*/
