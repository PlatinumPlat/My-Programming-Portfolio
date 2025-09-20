import java.util.*;

public class The_Lost_Cow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int a = 0;

        if (x == y) {
            System.out.println(0);
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
                    total += 2*dis;
                    a++;
                }
            } else {
                int dis = (int) Math.pow(2, a);
                if (y < x && y >= x - dis) {
                    int t = x - y;
                    total += t;
                    break;
                } else {
                    total += 2*dis;
                    a++;
                }
            }
        }

        System.out.println(total);
    }
}
