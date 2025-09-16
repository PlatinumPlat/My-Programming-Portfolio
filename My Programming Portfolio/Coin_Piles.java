import java.util.*;
import java.io.*;

public class Coin_Piles {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer at = new StringTokenizer(r.readLine());
        int t = Integer.parseInt(at.nextToken());

        for (int i = 0; i < t; i++) {
            StringTokenizer bt = new StringTokenizer(r.readLine());

            long a = Long.parseLong(bt.nextToken());
            long b = Long.parseLong(bt.nextToken());

            if (a == 0 && b == 0) {
                pw.println("YES");
            } else if (a == 0 || b == 0) {
                pw.println("NO");
            } else {
                if ((2 * a - b) >= 0 && (2 * a - b) % 3 == 0 && (2 * b - a) >= 0 && (2 * b - a) % 3 == 0) {
                    pw.println("YES");
                } else {
                    pw.println("NO");
                }
            }
        }
        pw.close();
    }
}
