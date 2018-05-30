package lesson5_prefix_sums;

public class PassingCars {
    public int solution(int[] A) {
        int passes = 0;
        int carsE = 0;
        for (int i : A) {
            if (i == 0) {
                carsE++;
            } else {
                passes += carsE;
            }
            if (passes > 1000000000) {
                return -1;
            }
        }
        return passes;
    }
}