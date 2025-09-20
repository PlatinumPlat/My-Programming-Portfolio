import java.util.*;

public class Parking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int a1 = in.nextInt();
        int d1 = in.nextInt();
        int a2 = in.nextInt();
        int d2 = in.nextInt();
        int a3 = in.nextInt();
        int d3 = in.nextInt();
        long kuna = 0L;
        for (double i = 1.5; i <= 100; i++) {
            int num = 0;
            if (i >= a1 && i <= d1) {
                num++;
            }
            if (i >= a2 && i <= d2) {
                num++;
            }
            if (i >= a3 && i <= d3) {
                num++;
            }

            if (num == 1) {
                kuna += A;
            } else if (num == 2) {
                kuna += B*2;
            } else if (num == 3) {
                kuna += C*3;
            }
        }
        System.out.println(kuna);
    }
}
