package Data_Structures_1;
import java.util.*;

public class TSS_Club_Fair_2017_Problem_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();
        int[] PSA = new int[1414220];
        for (int a = 0; a < N; a++) {
            long x = in.nextLong();
            long y = in.nextLong();
            double length = Math.sqrt(x * x + y * y);
            int m = (int) Math.ceil(length);
            if (m > 1414219) {
                PSA[1414219]++;
            } else {
                PSA[m]++;
            }

        }

        for (int b = 1; b < 1414220; b++) {
            PSA[b] += PSA[b - 1];
        }

        for (int c = 0; c < Q; c++) {
            int r = in.nextInt();
            System.out.println(PSA[r]);
        }
    }
}
