package Custom_Comparators_2;

import java.io.*;
import java.util.StringTokenizer;

public class Custom_Comparators_2_Sums_And_Differences {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        long[] a = new long[N];
        out.println("? 1 2");
        out.flush();

        StringTokenizer st2 = new StringTokenizer(r.readLine());
        long diff1 = Long.parseLong(st2.nextToken());
        out.println("? 1 2");
        out.flush();

        StringTokenizer st3 = new StringTokenizer(r.readLine());
        long prev = Long.parseLong(st3.nextToken());
        a[1] = prev / 2;
        a[0] = a[1] + diff1;

        for (int i = 2; i < N; i++) {
            out.println("? 1 " + (i + 1));
            out.flush();
            StringTokenizer nxt = new StringTokenizer(r.readLine());
            long diff = Long.parseLong(nxt.nextToken());
            a[i] = a[0] * 2 - diff;
        }

        out.print("!");
        for (int z = 0; z < N; z++) {
            out.print(" " + a[z]);
        }

        out.println();
        out.flush();
        out.close();
        return;
    }
}
