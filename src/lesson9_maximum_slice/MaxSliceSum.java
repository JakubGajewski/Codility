package lesson9_maximum_slice;

//result: 100%!

public class MaxSliceSum {
    public int solution(int[] A) {

        if (A.length == 1) {
            return A[0];
        }

        int current = A[0];
        int peak = A[0];

        for (int i=1; i < A.length; i++) {

            if (current < 0) {
                current = A[i];
            } else {
                current += A[i];
            }

            peak = Math.max(current, peak);
        }

        return peak;
    }
}
