import java.util.*;

public class Itami_And_Squad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int L = in.nextInt();
        int R = in.nextInt();
        int[] strengths = new int[N];
        for (int i = 0; i < N; i++) {
            strengths[i] = in.nextInt();
        }

        Arrays.sort(strengths);
        long total = 0;
        for (int i = R; N - i >= 0; i += L) {
            total += (long) strengths[N - i];
        }
        System.out.println(total);
    }
}