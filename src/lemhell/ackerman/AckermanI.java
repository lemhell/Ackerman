package lemhell.ackerman;

import java.util.Stack;

public class AckermanI extends Ackerman {
    @Override
    public int calculate(int m, int n) {
        Stack<Integer> s = new Stack<>();
        while (true) {
            if (m == 0) {
                n++;
                if (s.isEmpty()) {
                    break;
                }
                m = s.pop();
                continue;
            }
            if (n == 0) {
                m--;
                n = 1;
                continue;
            }
            s.push(m - 1);
            n--;
        }
        return n;
    }
}
