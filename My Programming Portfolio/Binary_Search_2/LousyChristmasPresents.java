package Binary_Search_2;

import java.util.*;
import java.lang.Math;
import java.io.*;

public class LousyChristmasPresents {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer c = new StringTokenizer(r.readLine());
        int[] firsts = new int[1000003];
        int[] lasts = new int[1000003];
        Arrays.fill(firsts,-1);
        Arrays.fill(lasts,-1);
        int N = Integer.parseInt(c.nextToken());
        int M = Integer.parseInt(c.nextToken());
        StringTokenizer b = new StringTokenizer(r.readLine());
        for (int a = 0; a < N; a++) {
            int n = Integer.parseInt(b.nextToken());
            if (firsts[n]==-1) {
                firsts[n]= a;
            }
            lasts[n] = a;
        }

        int longest = 0;
        for (int i = 0; i < M; i++) {
            StringTokenizer d = new StringTokenizer(r.readLine());
            int start = Integer.parseInt(d.nextToken());
            int end = Integer.parseInt(d.nextToken());
            if (lasts[end] != -1 && firsts[start] != -1) {
                longest = Math.max(lasts[end] - firsts[start] + 1, longest);
            }
        }
        out.println(longest);
        out.close();
    }
}
