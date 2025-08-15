package PSA_DSA_1;

import java.util.*;
import java.lang.Math;

public class DamageOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        long M = in.nextLong();

        long total = 0;
        long[] PSA = new long[N + 1];
        for (int a = 0; a < N; a++) {
            total += in.nextLong();
            PSA[a + 1] = total;
        }

        int l = N+1;

        int b = 1;
        int c = 1;

        while (b <= N && c<= N) {
            long result = PSA[c] - PSA[b - 1];

            if (result >= M) {
                l = Math.min(l, c - b + 1);
                b++;
            } else {
                c++;
            }
        }

        if (l== N+1) {
            System.out.println(-1);
        } else {
            System.out.println(l);
        }
    }
}
