package lesson10_primeNumbers;
import java.lang.Math;

//100% result

public class CountFactors {
    public int solution(int N) {

        if (N == 1) {
            return 1;
        }

        if (N == 2) {
            return 2;
        }

        int result = 2;

        double root = Math.sqrt(Double.valueOf(N));

        for (int i = 2; i < root; i++) {
            if (N%i == 0) {
                result = result + 2;
            }
        }

        if (Math.floor(root) * Math.floor(root) == N) {
            result++;
        }

        return result;
    }
}
