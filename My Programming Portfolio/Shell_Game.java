import java.util.*;
import java.io.*;


public class Shell_Game {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("shell.in"));
        PrintWriter pw = new PrintWriter("shell.out");

        int N = in.nextInt();
        int fC = 0;
        int f = 1;
        int sC = 0;
        int s = 2;
        int lC = 0;
        int l = 3;

        for (int i = 0; i < N; i++) {
            int firstSwap = in.nextInt();
            int secondSwap = in.nextInt();
            int guess = in.nextInt();

            if ((firstSwap == 1 && secondSwap == 2) || (firstSwap == 2 && secondSwap == 1)) {
                int c = f;
                f = s;
                s = c;
            } else if ((firstSwap == 1 && secondSwap == 3) || (firstSwap == 3 && secondSwap == 1)) {
                int c = f;
                f = l;
                l = c;
            } else {
                int c = s;
                s = l;
                l = c;
            }

            if (guess==1) {
                if (f==1) {
                    fC++;
                } else if (f==2) {
                    sC++;
                } else {
                    lC++;
                }
            } else if (guess==2) {
                if (s == 1) {
                    fC++;
                } else if (s == 2) {
                    sC++;
                } else {
                    lC++;
                }
            } else {
                if (l == 1) {
                    fC++;
                } else if (l == 2) {
                    sC++;
                } else {
                    lC++;
                }
            }
        }

        pw.println(Math.max(Math.max(fC, sC), lC));
        pw.close();
        in.close();
    }
}