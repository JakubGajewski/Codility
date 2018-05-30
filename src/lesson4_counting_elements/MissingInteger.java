package lesson4_counting_elements;

import java.util.Arrays;

public class MissingInteger  {
    public int solution(int[] A) {
        boolean isAnyPossitive = false;
        for (int i : A) {
            if (i>0) {
                isAnyPossitive = true;
                break;
            }
        }
        if (isAnyPossitive == false){
            return 1;
        }
        Arrays.sort(A);
        int previous = 0;
        for (int i : A){
            if (i<0){
                continue;
            }
            if (i != previous && i != previous+1) {
                return previous+1;
            }
            previous = i;
        }
        return previous + 1;
    }
}