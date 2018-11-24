package lesson3_time_complexity;
//Score: 100%

public class TapeEquilibrium {

    public int solution(int[] A) {

        if (A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }

        int sumOfLeft = A[0];
        int sumOfRight = 0;

        for (int i = 1; i < A.length; i++) {
            sumOfRight += A[i];
        }

        int absDifference = Math.abs(sumOfLeft - sumOfRight);

        for (int i = 1; i < A.length - 1; i++) {

            int currentValue = A[i];
            sumOfLeft += currentValue;
            sumOfRight -= currentValue;

            if (absDifference > Math.abs(sumOfLeft - sumOfRight)) {
                absDifference = Math.abs(sumOfLeft - sumOfRight);
            }
        }

        return absDifference;
    }
}
//    another 100% solution:
//    public int solution(int[] A) {
//        int first = A[0];
//        int rest = 0;
//        for (int i : A) {
//            rest += i;
//        }
//        rest -= A[0];
//        int minDifference = Math.abs(first - rest);
//        for (int i = 1; i < A.length - 1; i++) {
//            first += A[i];
//            rest -= A[i];
//            if ((Math.abs(first - rest) < minDifference)) {
//                minDifference = Math.abs(first - rest);
//            }
//        }
//        return minDifference;
//
//    }

