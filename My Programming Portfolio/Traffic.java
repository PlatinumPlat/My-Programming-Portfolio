import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.lang.Math;

public class Traffic {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("traffic.in");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("traffic.out");

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

        
        int start = 0;
        int end = 1001;

        for (int b = N - 1; b >= 0; b--) {
            if (indicats[b].equals("on")) {
                start -= uppers[b];
                end -= lowers[b];
                if (start < 0) {
                    start = 0;
                }
            } else if (indicats[b].equals("off")) {
                start += lowers[b];
                end += uppers[b];
            } else {
                start = Math.max(start, lowers[b]);
                end = Math.min(end, uppers[b]);
            }
        }

        out.println(start + " " + end);

        start = 0;
        end = 1001;

        for (int b = 0; b < N; b++) {
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

        out.println(start + " " + end);
        out.close();
    }
}
