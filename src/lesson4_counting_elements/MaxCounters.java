package lesson4_counting_elements;

import java.util.Arrays;

public class MaxCounters {
        public int[] solution(int N, int[] A) {

            int maxCounter = 0;
            int allRisedTo = maxCounter;
            int[] counters = new int[N];

            for (int i : A) {

                if (i > N) {
                    allRisedTo = maxCounter;
                } else {

                    if (counters[i-1] < allRisedTo) {
                        counters[i-1] = allRisedTo;
                    }
                    counters[i-1]++;

                    if (maxCounter < counters[i-1]) {
                        maxCounter = counters[i-1];
                    }
                }
            }


            for (int i = 0; i < counters.length; i++) {
                if (counters[i] < allRisedTo) {
                    counters[i] = allRisedTo;
                }
            }

            return counters;
        }
    }