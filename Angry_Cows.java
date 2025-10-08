import java.util.*;
import java.io.*;

public class Angry_Cows {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("angry.in"));
        PrintWriter out = new PrintWriter("angry.out");

        int N = in.nextInt();
        boolean[] bayles = new boolean[1000000001];
        int[] indx = new int[N];
        for (int i = 0; i < N; i++) {
            int indxcurr = in.nextInt();
            bayles[indxcurr] = true;
            indx[i] = indxcurr;
        }

        int max = 0;
        for (int a = 0; a < N; a++) {
            int total = 1;
            int curr = indx[a];
            int add = 1;
            while (true) {
                int last = -1;
                for (int i = curr + 1; i <= curr + add && i < 1000000001; i++) {
                    if (bayles[i]) {
                        last = i;
                        total++;
                    }
                }
                if (last == -1) {
                    break;
                } else {
                    curr = last;
                    add++;
                }
            }
            add = 1;
            curr = indx[a];
            while (true) {
                int last = -1;
                for (int i = curr - 1; i >= curr - add && i >= 0; i--) {
                    if (bayles[i]) {
                        last = i;
                        total++;
                    }
                }
                if (last == -1) {
                    break;
                } else {
                    curr = last;
                    add++;
                }
            }

            max = Math.max(max, total);
        }

        out.println(max);
        out.close();
        in.close();
    }
}
