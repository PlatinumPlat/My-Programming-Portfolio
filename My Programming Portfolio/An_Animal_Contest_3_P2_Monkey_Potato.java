import java.util.*;

public class An_Animal_Contest_3_P2_Monkey_Potato {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int K = in.nextInt();
        int D = in.nextInt();
        int min = 10;
        boolean zero = false;
        if (D == 1) {
            int n = in.nextInt();
            if (n == 0) {
                System.out.println(-1);
                return;
            } else {
                for (int i = 0; i < K; i++) {
                    System.out.print(n);
                }
                System.out.println();
                return;
            }
        }

        for (int a = 0; a < D; a++) {
            int n = in.nextInt();
            if (n == 0) {
                zero = true;
            } else {
                min = Math.min(min, n);
            }
        }

        if (!zero) {
            for (int b = 0; b < K; b++) {
                System.out.print(min);
            }
            System.out.println();
        } else if (K != 1) {
            System.out.print(min);
            for (int b = 2; b < K; b++) {
                System.out.print(0);
            }
            System.out.println(min);
        } else {
            System.out.println(min);
        }
    }
}
