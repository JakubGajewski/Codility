package lesson7_stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Fish {
    public int solution(int[] A, int[] B) {

        Deque<Integer> sizesOfFishesFlowingDown = new ArrayDeque<>();

        int result = 0;

        for (int i = 0; i < A.length; i++) {

            if (B[i] == 1) {
                sizesOfFishesFlowingDown.addLast(A[i]);
                continue;
            }

            if (B[i] == 0 && sizesOfFishesFlowingDown.isEmpty()) {
                result++;
                continue;
            }

            if (B[i] == 0 && sizesOfFishesFlowingDown.getLast() < A[i]) {
                sizesOfFishesFlowingDown.removeLast();
                i--;
                continue;
            }
            if (B[i] == 0 && sizesOfFishesFlowingDown.getLast() > A[i]) {
                continue;
            }
        }

        result += sizesOfFishesFlowingDown.size();
        return result;
    }
}

