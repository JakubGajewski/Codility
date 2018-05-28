package lesson3_time_complexity;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int first = A[0];
        int rest = 0;
        for (int i : A) {
            rest += i;
        }
        rest -= A[0];
        int minDifference = Math.abs(first - rest);
        for (int i = 1; i < A.length - 1; i++) {
            first += A[i];
            rest -= A[i];
            if ((Math.abs(first - rest) < minDifference)) {
                minDifference = Math.abs(first - rest);
            }
        }
        return minDifference;
        
    }
}
