package lesson9_maximum_slice;

public class AnotherSliceProblemJustStarted_ToBeFinished {
    public int solution(int[] A) {

        if (A.length == 0 || A.length == 1) {
            return 0;
        }

        int lowestValue = A[0];
        int lowestIndex = 9;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < lowestValue) {
                lowestValue = A[i];
                lowestIndex = i;
            }
        }

        int secondSliceMaximum = lowestIndex;

        for (int i = lowestIndex; i < A.length; i++) {
            if (A[i] > secondSliceMaximum) {
                secondSliceMaximum = A[i];
            }
        }

        int secondSliceProfit = secondSliceMaximum - lowestValue;

        int firstSliceMaximum = A[0];
        int firstSliceMaximumIndex = 0;

        for (int i = 0; i < lowestIndex; i++) {
            if (A[i] > firstSliceMaximum) {
                firstSliceMaximum = A[i];
                firstSliceMaximumIndex = i;
            }
        }

        int profit = 0;

        if (firstSliceMaximum < secondSliceMaximum) {
            profit = secondSliceMaximum - lowestValue;
        }



        if (profit <= 0) {
            profit = 0;
        }

        return profit;
    }
}
