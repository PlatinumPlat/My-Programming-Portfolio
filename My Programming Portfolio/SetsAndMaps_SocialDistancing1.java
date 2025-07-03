import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class SetsAndMaps_SocialDistancing1 {
    static String largestGap(String sub) {
        int max = 0;
        int count = 0;
        int si = 0;
        for (int i = 0; i < sub.length(); i++) {
            if (sub.charAt(i) == '0') {
                count++;
            } else {
                max = Math.max(count, max);
                if (max == count && count != 0) {
                    if (i == 0 || sub.charAt(i - 1) == '0') {
                        si = i - count;
                    }
                }
                count = 0;
            }
        }
        max = Math.max(count, max);
        if (max == count) {
            si = sub.length() - 1 - count + 1;
        }
        return max + " " + si;
    }

    static int smallestGap(String sub) {
        int min = sub.length();
        int count = 0;
        boolean first = true;
        for (int i = 0; i < sub.length(); i++) {
            if (sub.charAt(i) == '0') {
                count++;
            } else {
                if (!first) {
                    min = Math.min(count, min);
                    count = 0;
                }
                first = false;
            }
        }
        return min;
    }

    public static void main(String[] args) throws IOException {
        File inputFile = new File("socdist1.in");
        Scanner in = new Scanner(inputFile);
        PrintWriter pw = new PrintWriter("socdist1.out");

        int N = in.nextInt();
        in.nextLine();
        String cows = in.nextLine();

        int out = 0;
        in.close();

        // two largests
        StringBuffer a = new StringBuffer(cows);
        String[] o = largestGap(cows).split(" ");
        a.setCharAt((Integer.parseInt(o[0]) - 1) / 2 + Integer.parseInt(o[1]), '1');
        String[] o2 = largestGap(String.valueOf(a)).split(" ");
        a.setCharAt((Integer.parseInt(o2[0]) - 1) / 2 + Integer.parseInt(o2[1]), '1');
        out = Math.max(out, smallestGap(String.valueOf(a)));

        // two in one gap.
        StringBuffer b = new StringBuffer(cows);
        String[] g = largestGap(cows).split(" ");
        if (Integer.parseInt(g[0]) >= 3) {
            b.setCharAt((Integer.parseInt(g[0]) - 1) / 3 + Integer.parseInt(g[1]), '1');
            b.setCharAt((Integer.parseInt(g[0]) - 1) / 3 * 2 + Integer.parseInt(g[1]), '1');
            out = Math.max(out, smallestGap(String.valueOf(b)));
        }

        // one largest, one right
        StringBuffer f = new StringBuffer(cows);
        if (cows.charAt(N - 1) != '1') {
            f.setCharAt(N - 1, '1');
            String[] r = largestGap(String.valueOf(f)).split(" ");
            f.setCharAt((Integer.parseInt(r[0]) - 1) / 2 + Integer.parseInt(r[1]), '1');
            out = Math.max(out, smallestGap(String.valueOf(f)));
        }

        // one largest, one left
        StringBuffer d = new StringBuffer(cows);
        if (cows.charAt(0) != '1') {
            d.setCharAt(0, '1');
            String[] l = largestGap(String.valueOf(d)).split(" ");
            d.setCharAt((Integer.parseInt(l[0]) - 1) / 2 + Integer.parseInt(l[1]), '1');
            out = Math.max(out, smallestGap(String.valueOf(d)));
        }

        // one right, one left
        StringBuffer e = new StringBuffer(cows);
        if (cows.charAt(0) != '1' && cows.charAt(N - 1) != '1') {
            e.setCharAt(0, '1');
            e.setCharAt(N - 1, '1');
            out = Math.max(out, smallestGap(String.valueOf(e)));
        }
        
        pw.println(String.valueOf(out + 1));
        pw.close();
    }
}
