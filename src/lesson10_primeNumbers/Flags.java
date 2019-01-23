package lesson10_primeNumbers;

import java.util.ArrayList;
import java.util.List;

public class Flags {
    public int solution(int[] A) {

        if (A.length == 1 || A.length == 2) {
            return 0;
        }

        int possibleMaximum = (int) Math.sqrt(A.length);

        List<Integer> peaks = new ArrayList();

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i + 1] < A[i]) {
                peaks.add(i);
            }
        }

        int lastPeak = peaks.get(0);
        int result = 1;

        for (int i = 1; i < peaks.size(); i++) {
            if (peaks.get(i) - lastPeak <= possibleMaximum) {
                lastPeak = peaks.get(i);
                result++;
            }
        }

        return result;
    }
}
