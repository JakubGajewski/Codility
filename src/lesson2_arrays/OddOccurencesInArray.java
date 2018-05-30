package lesson2_arrays;

public class OddOccurencesInArray {
    public int solution(int[] A) {
        int x = A[0];
        int solution = 0;
        for (int i : A) {
            x = 0;
            for (int j : A) {
                if (i == j) {
                    x++;
                }
            }
            if (x == 1) {
                solution = i;
                return solution;
            }
        }
        return solution;
    }
}
