import java.io.*;
import java.util.*;

public class Lists_2_Photoshoot {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("photo.in");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("photo.out");

        int N = in.nextInt();

        int[] sums = new int[N - 1];

        for (int a = 0; a < N - 1; a++) {
            sums[a] = in.nextInt();
        }

        int[] min = new int[N];

        for (int i = 1; i < N + 1; i++) {
            int[] test = new int[N];
            boolean[] used = new boolean[N];
            boolean fail = false;
            test[0] = i;
            used[i - 1] = true;
            for (int b = 1; b < N; b++) {
                test[b] = sums[b - 1] - test[b - 1];
                if (test[b] > 0 && test[b] < N + 1) {
                    if (!used[test[b] - 1]) {
                        used[test[b] - 1] = true;
                    } else {
                        fail = true;
                        break;
                    }
                } else {
                    fail = true;
                    break;
                }
            }

            if (!fail) {
                min = test;
                break;
            }
        }

        out.print(min[0]);
        for (int z = 1; z < N; z++) {
            out.print(" ");
            out.print(min[z]);
        }
        out.close();
    }
}
