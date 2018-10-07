import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

public int solution(int[] A, int[] B) {

    Deque <Integer> sizesOfFishesFlowingDown = new ArrayDeque<>();

    int result = 0;

    for (int i = 0; i < A.length; i++) {

        if (B[i] == 1) {
            sizesOfFishesFlowingDown.addLast(B[i]);
            continue;
        }

        if (B[i] == 0 && sizesOfFishesFlowingDown.isEmpty()) {
            result++;
            continue;
        }

        if (sizesOfFishesFlowingDown.getLast() < A[i]) {
            sizesOfFishesFlowingDown.removeLast();
            i--;
            continue;
        }
    }

    result += sizesOfFishesFlowingDown.size();
    return result;

    }
}