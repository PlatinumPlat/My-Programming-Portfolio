package PSA_DSA_1;

import java.util.*;

public class Deforestation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] PSA = new int[N+1];
        PSA[0] = 0;

        int total = 0;
        for (int i = 0; i < N; i++) {
            total += in.nextInt();
            PSA[i+1] = total;
        }

        int Q = in.nextInt();
        for (int a=0; a<Q; a++) {
            int c = in.nextInt();
            int b = in.nextInt();

            System.out.println(PSA[b+1] - PSA[c]);
        }
    }
}
