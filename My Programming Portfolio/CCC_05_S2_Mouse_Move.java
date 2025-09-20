import java.util.*;

public class CCC_05_S2_Mouse_Move {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long c = in.nextLong();
        long r = in.nextLong();
        long xc = 0;
        long yc = 0;
        while (true) {
            long x = in.nextLong();
            long y = in.nextLong();

            if (x != 0 || y != 0) {
                xc += x;
                yc += y;
                if (xc < 0) {
                    xc = 0;
                } else if (xc > c) {
                    xc = c;
                }

                if (yc < 0) {
                    yc = 0;
                } else if (yc > r) {
                    yc = r;
                }

                System.out.println(xc + " " + yc);
            } else {
                return;
            }
        }
    }
}
