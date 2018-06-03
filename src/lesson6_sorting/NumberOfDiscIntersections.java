package lesson6_sorting;
/*
SCORE: 87%
PROBLEM:
Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
SpMY COMMENT: max array size depends on the server.
*/

public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int maxX = A[0];
        int minX = -A[0];
        for (int i = 0; i < A.length; i++) {
            if (i + A[i] > maxX) {
                maxX = i + A[i];
            }
            if (i - A[i] < minX) {
                minX = i - A[i];
            }
        }
        int n = Math.abs(maxX - minX + 1);

        int[] begginings = new int[n];
        int[] ends = new int[n];

        int iteration = 0;
        for (int a : A) {
            int start = iteration - a;

            begginings[start - minX]++;
            int end = iteration + a;
            ends[end - minX]++;
            iteration++;
        }

        int result = 0;
        int circlesInArea = 0;

        for (int j = 0; j < begginings.length; j++) {
            if (begginings[j] > 0) {
                result += begginings[j] * circlesInArea;
                for (int k = 0; k<begginings[j];k++) {
                    result+=k;
                }
                if (result > 10000000) {
                    return -1;
                }
                circlesInArea += begginings[j];
            }
            if (ends[j] > 0) {
                circlesInArea -= ends[j];
            }
        }
        return result;
    }
}


