package Data_Structures_1;

import java.util.*;

public class PermutaitionsAndProducts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        if (N==3) {
            System.out.println("? 1 2");
            System.out.flush();
            long ab = in.nextLong();
            if (ab==2) {
                System.out.println("? 1 3");
                System.out.flush();
                long ac = in.nextLong();
                if (ac == 3) {
                    System.out.println("! 1 2 3");
                } else {
                    System.out.println("! 2 1 3");
                }
            } else if (ab == 3) {
                System.out.println("? 1 3");
                System.out.flush();
                long ac = in.nextLong();
                if (ac == 2) {
                    System.out.println("! 1 3 2");
                } else {
                    System.out.println("! 3 1 2");
                }
            } else if (ab == 6) {
                System.out.println("? 1 3");
                System.out.flush();
                long ac = in.nextLong();
                if (ac==3) {
                    System.out.println("! 3 2 1");
                } else {
                    System.out.println("! 2 3 1");
                }
            }
            return;
        }

        Set<Long> total = new HashSet<>();
        for (long z = 0; z < N; z++) {
            total.add(z + 1);
        }
        long[] p = new long[N];

        System.out.println("? 1 2");
        System.out.flush();
        long ab = in.nextLong();

        System.out.println("? 1 3");
        System.out.flush();
        long ac = in.nextLong();

        System.out.println("? 2 3");
        System.out.flush();
        long bc = in.nextLong();

        double abc2 = (double) ab * ac * bc;
        double abc = Math.sqrt(abc2);
        p[0] = (long) (abc / bc);
        total.remove(p[0]);
        p[1] = (long) (abc / ac);
        total.remove(p[1]);
        p[2] = (long) (abc / ab);
        total.remove(p[2]);

        for (int d = 3; d < N - 1; d++) {
            System.out.println("? 1 " + (d+1));
            System.out.flush();
            long ad = in.nextLong();
            p[d] = ad / p[0];
            total.remove(p[d]);
        }

        System.out.print("!");
        for (int e = 0; e < N; e++) {
            if (p[e] != 0) {
                System.out.print(" " + p[e]);
            } else {
                System.out.print(" ");
                for (long output : total) {
                    System.out.print(output);
                }
            }
        }

        System.out.println();
        return;
    }
}
