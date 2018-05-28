package lesson3_time_complexity;

import java.util.Arrays;

public class PermMissingElement {
    public int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }
        Arrays.sort(A);
        for (int i = 1; i<=A.length; i++) {
            if (i != A[i-1]) {
                return i;
            }
        }
        return A[A.length-1]+1;
    }
}
