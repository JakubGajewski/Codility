package lesson3_time_complexity;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        return ((Y-X)/D) + ((Y-X) % D == 0 ? 0 : 1);
    }
}