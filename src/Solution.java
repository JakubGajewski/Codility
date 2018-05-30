import java.util.Arrays;


class Solution {
    public int solution(int A, int B, int K) {
        if (A%K == 0) {
            return (B/K - A/K + 1);
        }
        return (B/K - A/K);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(1, 6, 3));
    }
}