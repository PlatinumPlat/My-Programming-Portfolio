import java.util.*;

public class Bridge_Transport {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int W = in.nextInt();
        int N = in.nextInt();
        int[] weights = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            weights[i] = weights[i - 1] + in.nextInt();
        }

        for (int a = 1; a < 4; a++) {
            if (weights[a] > W) {
                System.out.println(a - 1);
                return;
            }
        }

        for (int a = 4; a <= N; a++) {
            if (weights[a] - weights[a - 4] > W) {
                System.out.println(a - 1);
                return;
            }
        }
        System.out.println(N);
    }
}
