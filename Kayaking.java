import java.util.*;

public class Kayaking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] weights = new int[2 * N];
        for (int i = 0; i < 2 * N; i++) {
            weights[i] = in.nextInt();
        }
        Arrays.sort(weights);

        long total = 0;
        long minimum = Long.MAX_VALUE;

        for (int b = 0; b < 2 * N; b++) {
            for (int c = b + 1; c < 2 * N; c++) {
                for (int d = 0; d < 2 * N - 1; d += 2) {
                    if (d == b && d + 1 == c) {
                        continue;
                    } else if (d == b || d == c) {
                        d--;
                    } else if (d + 1 == b || d + 1 == c) {
                        total += weights[d + 2] - weights[d];
                        d++;
                    } else {
                        total += weights[d + 1] - weights[d];
                    }
                }
                minimum = Math.min(minimum, total);
                total = 0;
            }
        }

        System.out.println(minimum);
    }
}