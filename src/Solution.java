
class Solution {
    public int solution(int[] A) {

        int secondOfTriplet = A[1];
        int sumOfTriplet = 0;
        int maxSumOfTriplet = 0;

        for (int i = 2; i < A.length -1; i++) {

            if (A[i] < secondOfTriplet){
                sumOfTriplet += secondOfTriplet;
                secondOfTriplet = A[i];
                sumOfTriplet -= secondOfTriplet;
            }

            sumOfTriplet = sumOfTriplet + A[i];

            if (sumOfTriplet > maxSumOfTriplet) {
                maxSumOfTriplet = sumOfTriplet;
            } else if (sumOfTriplet < 0) {
                secondOfTriplet = 0;
                sumOfTriplet = 0;
            }
        }

        return maxSumOfTriplet;
    }
}

