package lesson2_arrays;//https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
//Score: 100%

class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int[] B = new int[A.length];
        int counter = 0;
        for (int i : A) {
            if (counter + K < A.length) {
                B[counter + K] = i;
            } else if (K <= A.length){
                B[counter + K - A.length] = i;
            } else {
                K -= A.length;
                return solution(A,K);
            }
            counter++;
        }
        return B;
    }
}
