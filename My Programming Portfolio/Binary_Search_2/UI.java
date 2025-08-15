package Binary_Search_2;

import java.io.*;
import java.util.StringTokenizer;
import java.lang.*;

public class UI {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer aTokenizer = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(aTokenizer.nextToken());
        StringTokenizer bTokenizer = new StringTokenizer(r.readLine());
        String UI = bTokenizer.nextToken();

        long c = 0L;
        int curr = 1;
        for (int i = 1; i < 2 * N + 1; i++) {
            if (UI.charAt(i - 1) == 'I') {
                c += Math.abs(curr - i);
                curr += 2;
            }
        }
        if (curr == 2*N + 1) {
            pw.println(c);
        } else {
            pw.println(-1);
        }
        pw.close();
    }
}
