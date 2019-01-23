import java.util.*;

class Solution {
    public int solution(int[] A) {

        Integer numberOfEquiLeaders = 0;
        try {
            Integer leaderValue = findValueOfLeader(A).get();
            Integer  numberOfLeaderOccurencies  = getNumberOfOccurencies(leaderValue, A);

            Integer counted = 0;

            for (int i = 0; i < A.length; i++) {

                if (A[i] == leaderValue) {
                    counted++;
                }

                if ((counted > (i+1)/2) && (numberOfLeaderOccurencies - counted > (A.length -i+ -1)/2)){
                    numberOfEquiLeaders++;
                }
            }
            if (A[A.length -1] == leaderValue) {
                counted++;
            }
        } finally {
            return numberOfEquiLeaders;
        }
    }

    public Optional<Integer> findValueOfLeader (int[] A) {

        if (A.length == 1) {
            return Optional.of(A[0]);
        }

        Deque <Integer> stackOfElements = new ArrayDeque<>();

        for (int i = 0; i < A.length; i++) {

            if (stackOfElements.isEmpty()) {
                stackOfElements.add(A[i]);
            } else {
                 if (stackOfElements.pollFirst() == A[i]) {
                     stackOfElements.addFirst(A[i]);
                     stackOfElements.addFirst(A[i]);
                 };
            }
        }
        if (stackOfElements.size() > 0) {
            return Optional.of(stackOfElements.getFirst());
        }
        return Optional.empty();
    }

    public Integer getNumberOfOccurencies (int checkedNumber, int [] arrray) {

        int counter = 0;
        for (int i : arrray) {
            if (i == checkedNumber) {
                counter++;
            }
        }
        return counter;
    }
}