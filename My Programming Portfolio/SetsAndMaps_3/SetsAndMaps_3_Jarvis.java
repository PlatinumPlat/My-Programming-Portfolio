package SetsAndMaps_3;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class SetsAndMaps_3_Jarvis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] drone = new int[N];
        int[] require = new int[N];

        for (int a=0; a<N; a++) {
            drone[a] = in.nextInt();
        }

        for (int b = 0; b < N; b++) {
            require[b] = in.nextInt();
        }

        Map<Integer, Integer> occur = new HashMap<>();

        for (int i=0; i<N; i++) {
            int diff = require[i] - drone[i];

            if (occur.get(diff) == null) {
                occur.put(diff, 1);
            } else {
                occur.put(diff, occur.get(diff)+1);
            }
        }
        
        int max = 0;
        for (int z : occur.values()) {
            max = Math.max(z, max);
        }
        System.out.println(max);
    }
}