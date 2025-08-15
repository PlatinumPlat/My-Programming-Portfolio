package Binary_Search_1;

import java.util.*;;

public class Harvest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        long K = in.nextLong();

        long[] PSA = new long[N];
        for (int a = 0; a < M; a++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;

            PSA[x]++;
            if (y + 1 < N) {
                PSA[y + 1]--;
            }
        }
        
        for (int b = 1; b < N; b++) {
            PSA[b] += PSA[b - 1];
        }
        for (int f = 0; f < N; f++) {
            PSA[f] = M-PSA[f];
        }
        for (int e = 1; e < N; e++) {
            PSA[e] += PSA[e - 1];
        }
        
        if (K == 0) {
            System.out.println(0);
            return;
        } else if (K > (M * N - PSA[N - 1])) {
            System.out.println(-1);
            return;
        }

        int c = 0;
        int d = 0;
        long min = N + 5;
        while (c < N && d < N) {
            long count;
            if (c == 0) {
                count = PSA[d];
            } else {
                count = PSA[d] - PSA[c - 1];
            }
            if (count >= K) {
                min = Math.min(min, d - c + 1);
                c++;
            } else {
                d++;
            }
        }

        if (min == N + 5) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}
