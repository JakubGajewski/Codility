package lesson9_maximum_slice;

//result: 100%!

public class MaxSliceSum {
    public int solution(int[] A) {

        int firstOfTripletIndex = 0;
        int secondOfTriplet = A[1];
        int secondOfTripletIndex = 1;
        int thirdOfTripletIndex = 2;

        int sumOfTriplet = 0;
        int maxSumOfTriplet = 0;

        boolean isLowerFound = false;

        for (int i = 2; i <= A.length -2; i++) {

            if (sumOfTriplet < 0) {
                sumOfTriplet = 0;
            }

            if (A[i] < secondOfTriplet){
                sumOfTriplet += secondOfTriplet;
                secondOfTriplet = A[i];
                secondOfTripletIndex = i;
                sumOfTriplet -= secondOfTriplet;
            }

            sumOfTriplet = sumOfTriplet + A[i];

            if (sumOfTriplet > maxSumOfTriplet) {
                thirdOfTripletIndex = i+1;
                maxSumOfTriplet = sumOfTriplet;
            }
        }

        firstOfTripletIndex = thirdOfTripletIndex -2;
        secondOfTripletIndex = thirdOfTripletIndex -1;
        secondOfTriplet = A[secondOfTripletIndex];
        sumOfTriplet = 0;
        maxSumOfTriplet = 0;

        for (int i = thirdOfTripletIndex -2; i >= 1; i--) {

            if (A[i] < secondOfTriplet){
                sumOfTriplet += secondOfTriplet;
                secondOfTriplet = A[i];
                secondOfTripletIndex = i;
                sumOfTriplet -= secondOfTriplet;
            }

            sumOfTriplet = sumOfTriplet + A[i];

            if (sumOfTriplet > maxSumOfTriplet) {
                thirdOfTripletIndex = i-1;
                maxSumOfTriplet = sumOfTriplet;
            }

        }

        return maxSumOfTriplet;
    }
}
