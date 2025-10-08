import java.util.*;

public class Cow_College {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int tuitions[] = new int[N];

        for (int i = 0; i < N; i++) {
            tuitions[i] = in.nextInt();
        }
        Arrays.sort(tuitions);
        int pay = tuitions[0];
        long total = tuitions[0] * N;

        for (int a = 1; a < N; a++) {
            if (tuitions[a] != tuitions[a - 1]) {
                int curr = tuitions[a];
                long income = ((long) (N - a)) * ((long) curr);
                if (income > total) {
                    pay = curr;
                    total = income;
                }
            }
        }

        System.out.println(total + " " + pay);
    }
}
