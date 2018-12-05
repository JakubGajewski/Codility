package lesson5_prefix_sums;

public class MinAvgTwoSlice {
// 40%... I have to improve! 60 of correctness and 20 of performance... but only correctness failures in perf tests
        public int solution(int[] A) {

            double div = 2;
            double minPrefSumAvg = (A[0] + A[1]) / div;
            int minPrefEndIndex = 1;
            double prefSumAvg = (A[0] + A[1]) / div;

            for (int i = 2; i < A.length; i++) {
                prefSumAvg = (prefSumAvg * div + A[i])  / (div + 1);
                if (prefSumAvg < minPrefSumAvg) {
                    minPrefSumAvg = prefSumAvg;
                    minPrefEndIndex = i;
                }
                div++;
            }

            System.out.println(minPrefEndIndex + " - end");
            System.out.println(minPrefSumAvg + " - min pref avg");

            div = 2;
            double sliceAvg = (A[minPrefEndIndex -1] + A[minPrefEndIndex]) / div;
            System.out.println("Initial slice avg: " + A[minPrefEndIndex -1] + " plus " + A[minPrefEndIndex] + " przez " + div + " rowna sie " + sliceAvg);
            double minSliceAvg = sliceAvg;
            int minSliceStartIndex = minPrefEndIndex - 1;


            for (int i = minSliceStartIndex - 1; i >= 0; i--) {
                sliceAvg = ((sliceAvg * div) + A[i]) / (div + 1);
                System.out.println("Condition: " + sliceAvg + " and " + minSliceAvg);
                if (sliceAvg <= minSliceAvg) {
                    minSliceAvg = sliceAvg;
                    minSliceStartIndex = i;
                }
                div++;
            }

            System.out.println(minSliceStartIndex + " - start");
            System.out.println(minSliceAvg + " - min slive avg");

            return minSliceStartIndex;

    }
}
