package PSA_DSA_1;

import java.util.*;

public class Sum_Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int total1 = 0;
        int[] PSA1 = new int[N];
        for (int a = 0; a < N; a++) {
            total1 += in.nextInt();
            PSA1[a] += total1;
        }

        int total2 = 0;
        int[] PSA2 = new int[N];
        for (int b = 0; b < N; b++) {
            total2 += in.nextInt();
            PSA2[b] += total2;
        }

        int largest = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (PSA1[i] == PSA2[i]) {
                largest = i + 1;
                break;
            }
        }

        System.out.println(largest);
    }
}
