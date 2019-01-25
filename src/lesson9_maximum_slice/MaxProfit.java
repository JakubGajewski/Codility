package lesson9_maximum_slice;

public class MaxProfit {
    public int solution(int[] A) {

        if (A.length < 2) {
            return 0;
        }

        int currentMin = A[0];
        int currentMax = A[0];
        int currentProfit = 0;
        int maxProfit = 0;

        for (int i : A) {

            if (i < currentMin) {
                currentMin = i;
                currentMax = i;
            }

            if (i > currentMax) {
                currentMax = i;
            }

            currentProfit = currentMax - currentMin;

            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }
}
