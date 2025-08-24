package Binary_Search_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Systests {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer aT = new StringTokenizer(in.readLine());
        int B = Integer.parseInt(aT.nextToken());
        long[] fs = new long[B];
        long[] es = new long[B];
        int[] ps = new int[B];
        for (int a = 0; a < B; a++) {
            StringTokenizer bT = new StringTokenizer(in.readLine());
            fs[a] = Long.parseLong(bT.nextToken());
            es[a] = Long.parseLong(bT.nextToken());
            ps[a] = Integer.parseInt(bT.nextToken());
        }
        StringTokenizer cT = new StringTokenizer(in.readLine());
        int F = Integer.parseInt(cT.nextToken());
        long[] skip = new long[F];
        for (int b = 0; b < F; b++) {
            StringTokenizer dT = new StringTokenizer(in.readLine());
            skip[b] = Long.parseLong(dT.nextToken());
        }
        Arrays.sort(skip);
        long points = 0;
        if (F == 0) {
            for (int c = 0; c < B; c++) {
                points += ps[c];
            }
            out.println(points);
            out.close();
            return;
        }

        for (int c = 0; c < B; c++) {
            int b1 = Arrays.binarySearch(skip, fs[c]);
            int b2 = Arrays.binarySearch(skip, es[c]);
            if (b1<0 && b2 <0 && b1==b2) {
                points += ps[c];
            }
        }
        out.println(points);
        out.close();

    }
}