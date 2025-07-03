package Lists_2;
import java.util.Scanner;
import java.util.Arrays;

public class Lists_2_That_Missing_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] out = new int[5];

        for (int i=0; i<5; i++) {
            int N = in.nextInt();
            int[] l = new int[N];
            for (int a=0; a<N; a++) {
                l[a] = in.nextInt();
            }
            Arrays.sort(l);

            if (l[0] != 1) {
                out[i] = 1;
            } else if (l[N-1] != N+1) {
                out[i] = N+1;
            } else {
                for (int b = 1; b < N; b++) {
                    if (l[b] != b+1) {
                        out[i] = b+1;
                        break;
                    }
                }
            }
        }

        for (int z =0; z<5; z++) {
            System.out.println(out[z]);
        }
    }
}
