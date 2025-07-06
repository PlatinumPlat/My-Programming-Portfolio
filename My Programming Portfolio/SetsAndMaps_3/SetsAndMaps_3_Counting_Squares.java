package SetsAndMaps_3;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class SetsAndMaps_3_Counting_Squares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int v = in.nextInt();

        int[] Hs = new int[h];
        int[] Vs = new int[v];

        for (int a=0; a<h; a++) {
            Hs[a] = in.nextInt();
        }

        for (int d = 0; d < v; d++) {
            Vs[d] = in.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> mapV = new HashMap<>();

        for (int b = 0; b < h; b++) {
            for (int c = b + 1; c < h; c++) {
                int diff = Math.abs(Hs[b] - Hs[c]);

                if (map.containsKey(diff)) {
                    map.put(diff, map.get(diff) + 1);
                } else {
                    map.put(diff, 1);
                }
            }
        }

        for (int e = 0; e < v; e++) {
            for (int f = e + 1; f < v; f++) {
                int diff = Math.abs(Vs[e] - Vs[f]);

                if (mapV.containsKey(diff)) {
                    mapV.put(diff, mapV.get(diff) + 1);
                } else {
                    mapV.put(diff, 1);
                }
            }
        }

        int count = 0;
        for (int z:map.keySet()) {
            if (mapV.containsKey(z)) {
                count += map.get(z)*mapV.get(z);
            }
        }

        System.out.println(count);
    }
}
