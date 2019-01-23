package lesson8_leader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Optional;

//A non-empty array A consisting of N integers is given.
//
//        The leader of this array is the value that occurs in more than half of the elements of A.
//
//        An equi leader is an index S such that 0 ≤ S < N − 1 and two sequences A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N − 1] have leaders of the same value.
//
//        For example, given array A such that:
//        A[0] = 4
//        A[1] = 3
//        A[2] = 4
//        A[3] = 4
//        A[4] = 4
//        A[5] = 2
//
//        we can find two equi leaders:
//
//        0, because sequences: (4) and (3, 4, 4, 4, 2) have the same leader, whose value is 4.
//        2, because sequences: (4, 3, 4) and (4, 4, 2) have the same leader, whose value is 4.
//
//        The goal is to count the number of equi leaders.
//
//        Write a function that, given a non-empty array A consisting of N integers, returns the number of equi leaders.
//
//        For example, given:
//        A[0] = 4
//        A[1] = 3
//        A[2] = 4
//        A[3] = 4
//        A[4] = 4
//        A[5] = 2
//
//        the function should return 2, as explained above.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [1..100,000];
//        each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].
//
//        MY_SCORE:100%; wors-case complexity: O (n)

class EquiLeader {

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

        Deque<Integer> stackOfElements = new ArrayDeque<>();

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



// Alternative, slower(O(n log n)), but also 100% solution:
//    public int solution(int[] A) {
//
//        if (A.length == 1) {
//            return 0;
//        }
//
//        int[] B = new int [A.length];
//
//        for (int i = 0; i < A.length; i++) {
//            B[i] = A[i];
//        }
//
//        Arrays.sort(B);
//
//        int candidate = B[B.length/2];
//
//        int numberOfCandidates = 0;
//
//        for (int i : A) {
//            if (i == candidate) {
//                numberOfCandidates++;
//            }
//        }
//
//        if (numberOfCandidates <= (A.length/2)) {
//            return 0;
//        }
//
//        int numberOfEquiLeaders = 0;
//        int leader = candidate;
//        int numberOfLeaders = numberOfCandidates;
//        int left = 0;
//        int right = numberOfLeaders;
//
//        for (int i = 0; i < A.length-1; i++) {
//
//            if (A[i] == leader) {
//                left++;
//                right--;
//            }
//
//            if (left > (i+1)/2 && right > (A.length-(i+1))/2) {
//                numberOfEquiLeaders++;
//            }
//        }
//        return numberOfEquiLeaders;
//    }
}
