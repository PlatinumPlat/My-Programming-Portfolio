package Strings_2;
import java.util.Scanner;

public class Strings_2_Missing_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long[] out = new long[n];

        for (int i=0; i<n; i++) {
            long N = in.nextLong();
            long S = in.nextLong();
            long count = 0;

            long total = (N+1)*N/2;

            if (total-S <= 2*N-1) {
                if (total-S > N+1) {
                    count = N-(total-S-N-1);
                    if (total-S %2 ==0 && (total-S)/2 <= N && (total-S)/2 >= total-S-N) {
                        count--;
                    }
                } else if (total-S < N+1) {
                    count = total-S-1;
                    if (total-S%2 ==0) {
                        count--;
                    }
                } else {
                    count = N;
                    if (total-S%2==0) {
                        count--;
                    }
                }
            }
            out[i] = count/2;
        }

        for (int a=0; a<n; a++) {
            System.out.println(out[a]);
        }
    }
}
