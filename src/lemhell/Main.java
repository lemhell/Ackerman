package lemhell;

import lemhell.ackerman.AckermanI;
import lemhell.ackerman.AckermanR;

public class Main {

    public static void main(String[] args) {
        testAckerman();
    }

    private static void testAckerman() {
        AckermanR ackermanR = new AckermanR();
        AckermanI ackermanI = new AckermanI();
        for (int m = 0; m < 4; m++) {
            for (int n = 0; n < 4; n++) {
                assert(ackermanI.calculate(m, n) == ackermanR.calculate(m, n));
            }
        }
    }
}
