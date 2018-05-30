package lesson4_counting_elements;

import java.util.Arrays;

class PermCheck {
    public int solution(int[] A) {
        Arrays.sort(A);
        if (A[A.length-1] != A.length) {
            return 0;
        }
        int checker = 1;
        for (int i : A) {
            if (i != checker) {
                return 0;
            }
            checker++;
        }
        return 1;
    }
}