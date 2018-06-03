class Solution {
    public int solution(int[] A) {

        int maxX = A[0];
        int minX = -A[0];
        for (int i = 0; i < A.length; i++) {
            if (i + A[i] > maxX) {
                maxX = i + A[i];
            }
            if (i - A[i] < minX) {
                minX = i - A[i];
            }
        }
        int n = maxX - minX;

        int[] begginings = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < A.length; i++) {
            int start = i + A[i];
            begginings[start]++;
            int end = i - A[i];
            ends[end]++;
        }

        int result = 0;
        int circlesInArea = 0;
        for(int j = minX; j<= maxX; j++){
            if (begginings[j]>0) {
                result += begginings[j]*circlesInArea;
                result += begginings[j]-1;
                circlesInArea += begginings[j];
            }
            if (ends[j]>0) {
                circlesInArea -= ends[j];
            }
        }
        return result;
    }
}