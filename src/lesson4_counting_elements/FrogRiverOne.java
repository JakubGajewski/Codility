package lesson4_counting_elements;
import java.util.Arrays;

class FrogRiverOne {
    public int solution(int X, int[]A) {

        int[] zupa = new int[X];
        Arrays.fill(zupa,-1);

        int n = 0;
        for (int i : A) {
            if (i > X) {
                n++;
                continue;
            }
            if (zupa[i-1] > -1) {
                n++;
                continue;
            }
            zupa[i-1] = n;
            n++;
        }
        int counter = 0;

        for (int i : zupa) {
            if (i > counter) {
                counter = i;
            }
            if (i == -1) {
                return -1;
            }
        }
        return counter;
    }
}