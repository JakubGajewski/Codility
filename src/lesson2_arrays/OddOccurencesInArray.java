package lesson2_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int[] A) {

        if (A.length == 1) {
            return A[0];
        }

        List<Integer> sorted = new ArrayList<>();

        for (int i : A) {
            sorted.add(i);
        }

        Collections.sort(sorted);

        int previous;
        int current;

        for (int i = 1; i < A.length; i = i+2) {

            previous = sorted.get(i-1);
            current = sorted.get(i);

            if (previous != current) {
                return previous;
            }
        }

        return sorted.get(sorted.size()-1);
    }
}
/*
Less efficient solution:
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
*/