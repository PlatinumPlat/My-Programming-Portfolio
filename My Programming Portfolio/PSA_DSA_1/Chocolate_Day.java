package PSA_DSA_1;

import java.util.*;
import java.io.*;

public class Chocolate_Day {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer first = new StringTokenizer(r.readLine());
        int I = Integer.parseInt(first.nextToken());
        int waves = Integer.parseInt(first.nextToken());
        int[] PSA = new int[I + 1];

        for (int i = 0; i < waves; i++) {
            StringTokenizer sec = new StringTokenizer(r.readLine());
            int x1 = Integer.parseInt(sec.nextToken());
            int x2 = Integer.parseInt(sec.nextToken());
            int K = Integer.parseInt(sec.nextToken());

            PSA[x1] += K;
            if (x2 < I) {
                PSA[x2 + 1] -= K;
            }
        }

        int total = 0;

        for (int a=1; a<=I; a++) {
            total += PSA[a];
            PSA[a] = total;
        }

        int total2 = 0;
        for (int a = 1; a <= I; a++) {
            total2 += PSA[a];
            PSA[a] = total2;
        }

        int count = 0;
        StringTokenizer last = new StringTokenizer(r.readLine());
        int minN = Integer.parseInt(last.nextToken());
        int b = 1;
        int c = 1;

        while (b <= I && c <= I) {
            int result = PSA[c] - PSA[b - 1];

            if (result <= minN) {
                count = Math.max(count, c - b + 1);
                c++;
            } else {
                b++;
            }
        }

        System.out.println(count);
    }
}
