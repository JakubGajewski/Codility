package lesson8_leader;

import java.util.ArrayDeque;
import java.util.Deque;

//Correctness: 75%, performance: 100%
public class Dominator {
    public int solution(int[] A) {

        int result = -1;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < A.length; i++) {

            if (stack.isEmpty()) {
                stack.add(A[i]);
                continue;
            }

            if (stack.peekFirst() != A[i]) {
                stack.pollFirst();
            } else {
                stack.addFirst(A[i]);
            }

        }

        if (stack.isEmpty()) {
            return -1;
        }

        int possibleDominator = stack.getFirst();
        int numberOfPossibleDominators = 0;

        for (int i : A) {
            if (i == possibleDominator) {
                numberOfPossibleDominators++;
            }
        }

        if (numberOfPossibleDominators <= A.length / 2) {
            return -1;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == possibleDominator) {
                return i;
            }
        }

        return -1;
    }
}
