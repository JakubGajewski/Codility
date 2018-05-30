package lesson4_counting_elements;

import java.util.Arrays;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                for (int j = 0; j < N; j++) {
                    counters[j] = maxCounter;
                }
                continue;
            }
            if (1 <= A[i] && A[i] <= N) {
                counters[A[i] - 1] = counters[A[i] - 1] + 1;
                if (counters[A[i] - 1] > maxCounter) {
                    maxCounter = counters[A[i] - 1];
                }
            }
        }
        return counters;
    }
}
