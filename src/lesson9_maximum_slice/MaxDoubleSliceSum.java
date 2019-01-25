package lesson9_maximum_slice;

////Correctness: 100%, performance: 85%, total: 92%
/*
▶
large_ones
random numbers from -1 to 1, length = ~100,000
✘
WRONG ANSWER
got 455 expected 456
1.
0.152 s
WRONG ANSWER, got 455 expected 456
*/
public class MaxDoubleSliceSum {
    public int solution(int[] A) {

        int secondOfTriplet = A[1];
        int sumOfTriplet = 0;
        int maxSumOfTriplet = 0;

        for (int i = 2; i < A.length - 1; i++) {

            if (A[i] < secondOfTriplet) {
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

//Previous solution:
//Correctness: 100%, performance: 85%, total: 92%
// large_sequence
//many the same small sequences, length = ~100,000
//✘
//WRONG ANSWER
//got 11 expected 20
//1.
//0.152 s
//OK
//2.
//0.168 s
//WRONG ANSWER, got 11 expected 20
/*

public class MaxDoubleSliceSum {
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
                thirdOfTripletIndex = i-1;
                maxSumOfTriplet = sumOfTriplet;
            }

        }

        return maxSumOfTriplet;
    }

}
*/
