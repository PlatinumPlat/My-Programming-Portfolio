import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.lang.Math;

public class traffic2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String[] indicats = new String[N];
        int[] lowers = new int[N];
        int[] uppers = new int[N];

        int firstN = -1;
        int lastN = -1;
        for (int a = 0; a < N; a++) {
            indicats[a] = in.next();
            lowers[a] = in.nextInt();
            uppers[a] = in.nextInt();
            if (indicats[a].equals("none")) {
                if (firstN == -1) {
                    firstN = a;
                }
                lastN = a;
            }
        }

        int start = lowers[firstN];
        int end = uppers[firstN];

        for (int b = firstN; b <= lastN; b++) {
            if (indicats[b].equals("on")) {
                start += lowers[b];
                end += uppers[b];
            } else if (indicats[b].equals("off")) {
                start -= uppers[b];
                end -= lowers[b];
                if (start < 0) {
                    start = 0;
                }
            } else {
                start = Math.max(start, lowers[b]);
                end = Math.min(end, uppers[b]);
            }
        }

        int backStart = start;
        int backEnd = end;

        for (int b = firstN - 1; b >= 0; b--) {
            if (indicats[b].equals("on")) {
                backStart -= uppers[b];
                backEnd -= lowers[b];
                if (backStart < 0) {
                    backStart = 0;
                }
            } else if (indicats[b].equals("off")) {
                backStart += lowers[b];
                backEnd += uppers[b];
            } else {
                backStart = Math.max(backStart, lowers[b]);
                backEnd = Math.min(backEnd, uppers[b]);
            }
        }

        System.out.println(backStart + " " + backEnd);

        int forStart = start;
        int forEnd = end;

        for (int b = lastN + 1; b <= N - 1; b++) {
            if (indicats[b].equals("on")) {
                forStart += lowers[b];
                forEnd += uppers[b];    
            } else if (indicats[b].equals("off")) {
                forStart -= uppers[b];
                forEnd -= lowers[b];
                if (forStart < 0) {
                    forStart = 0;
                }
            } else {
                forStart = Math.max(forStart, lowers[b]);
                forEnd = Math.min(forEnd, uppers[b]);
            }
        }

        System.out.println(forStart + " " + forEnd);
        System.out.close();
    }
}
