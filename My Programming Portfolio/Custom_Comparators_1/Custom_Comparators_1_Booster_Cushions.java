package Custom_Comparators_1;

import java.util.*;

public class Custom_Comparators_1_Booster_Cushions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        in.nextInt();
        int K = in.nextInt();

        int[] hs = new int[K];
        for (int i = 0; i < K; i++) {
            hs[i] = in.nextInt();
        }

        Arrays.sort(hs);

        int f = (K + M - 1) / M;
        int[][] seats = new int[M][f];
        int curr = K - 1;
        long total = 0L;

        for (int b = 0; b < f; b++) {
            if (curr >= 0) {
                seats[0][b] = hs[curr];
                curr--;
            }
        }

        int upto = M - 1 - (f * M - K);
        for (int a = 1; a < M; a++) {
            if (a <= upto) {
                for (int b = 0; b < f; b++) {
                    if (curr >= 0) {
                        total += seats[a - 1][b] - hs[curr] + 1;
                        seats[a][b] = seats[a - 1][b] + 1;
                        curr--;
                    } else {
                        break;
                    }
                }
            } else {
                for (int b = 0; b < f-1; b++) {
                    if (curr >= 0) {
                        total += seats[a - 1][b] - hs[curr] + 1;
                        seats[a][b] = seats[a - 1][b] + 1;
                        curr--;
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.print(total);
    }
}