package lemhell.ackerman;

public class AckermanR extends Ackerman {
    @Override
    public int calculate(int m, int n) {
        if (m == 0) return n + 1;
        if (n == 0) return calculate(m - 1, 1);
        return calculate(m - 1, calculate(m, n - 1));
    }
}
