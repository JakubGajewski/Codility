package lesson10_primeNumbers;

public class PrimeNumbers {
    public int solution(int N) {

        int a = (int)Math.ceil(Math.sqrt(N));

        while (N%a != 0) {
            a--;
        }

        int b = N/a;

        int perimeter = 2 *(a+b);

        return perimeter;
    }
}
