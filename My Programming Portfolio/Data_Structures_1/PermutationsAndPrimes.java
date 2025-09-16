package Data_Structures_1;

import java.util.*;

public class PermutationsAndPrimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if (N == 1) {
            System.out.println(1);
            return;
        } else if (N == 2) {
            System.out.println(-1);
            return;
        }

        boolean[] notprime = new boolean[2 * N];
        notprime[0] = true;
        for (int a = 2; a < 2 * N; a++) {
            for (int b = 2; b * a <= 2 * N; b++) {
                notprime[b * a - 1] = true;
            }
        }

        for (int d = 1; d <= N; d += 2) {
            for (int e = 2; e <= N; e += 2) {
                if (notprime[d + e - 1]) {
                    boolean first = false;
                    for (int odd = 1; odd <= N; odd += 2) {
                        if (!first && odd != d) {
                            System.out.print(odd);
                            first = true;
                        } else if (odd != d) {
                            System.out.print(" " + odd);
                        }
                    }

                    if (!first) {
                        System.out.print(d);
                    } else {
                        System.out.print(" " + d);
                    }

                    System.out.print(" " + e);
                    for (int even = 2; even <= N; even += 2) {
                        if (even != e) {
                            System.out.print(" " + even);
                        }
                    }
                    System.out.println();
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}
