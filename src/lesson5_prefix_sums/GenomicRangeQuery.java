package lesson5_prefix_sums;
//Score: 12%
class GenomicRangeQuery {
        public int[] solution(String S, int[] P, int[] Q) {
            int[] solution = new int[P.length];
            int min;
            for (int i = 0; i<S.length(); i++){
                for (int j = 0; j < P.length; j++) {
                    if (i >= P[j] && i <= Q[j]) {
                        min = 4;
                        if (S.charAt(i) == 'A' && min> 1 ) {
                            min = 1;
                        } else if (S.charAt(i) == 'C' && min > 2){
                            min = 2;
                        } else if (S.charAt(i) == 'G' && min > 3){
                            min = 3;
                        }
                        if (solution[j] > min || solution[j] == 0) {
                            solution[j] = min;
                        };
                    }
                }
            }
            return solution;
        }
    }

