import java.util.*;
import java.io.*;

public class The_Lost_Cow3 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("lostcow.in"));
        PrintWriter pw = new PrintWriter("lostcow.out");

        int x = in.nextInt();
        int y = in.nextInt();
        int a = 0;

        if (x == y) {
            pw.println(0);
            in.close();
            pw.close();
            return;
        }

        long total = 0L;
        while (true) {
            if (a % 2 == 0) {
                int dis = (int) Math.pow(2, a);
                if (y > x && y <= x + dis) {
                    int t = y - x;
                    total += t;
                    break;
                } else {
                    total += 2 * dis;
                    a++;
                }
            } else {
                int dis = (int) Math.pow(2, a);
                if (y < x && y >= x - dis) {
                    int t = x - y;
                    total += t;
                    break;
                } else {
                    total += 2 * dis;
                    a++;
                }
            }
        }

        pw.println(total);
        pw.close();
        in.close();

    }
}
