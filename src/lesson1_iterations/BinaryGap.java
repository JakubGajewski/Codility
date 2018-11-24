package lesson1_iterations;//https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
//Score: 100%

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

class BinaryGap {
    List<Integer> binaryList = new ArrayList<>();

    public int solution(int N) {
        do {
            binaryList.add(N % 2);
            N = N / 2;
        } while (N > 1);
        binaryList.add(1);

        while (binaryList.get(0) == 0) {
            binaryList.remove(0);
        }

        while (binaryList.get(binaryList.size() - 1) == 0) {
            binaryList.remove(binaryList.size() - 1);
        }

        int zeroes = 0;
        int binaryGap = 0;

        for (Integer i : binaryList) {
            if (i == 0) {
                zeroes++;
            }
            if (zeroes >= binaryGap) {
                binaryGap = zeroes;
            }
            if (i == 1) {
                zeroes = 0;
            }
        }
        return binaryGap;
    }
}