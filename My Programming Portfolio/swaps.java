import java.io.*;
import java.util.*;

public class swaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();
        int A1 = in.nextInt();
        int A2 = in.nextInt();
        int B1 = in.nextInt();
        int B2 = in.nextInt();

        int[] a = new int[N];
        Map<Integer, Integer> c = new HashMap<>();
        Map<Integer, Integer> d = new HashMap<>();
        for (int b = 0; b < N; b++) {
            a[b] = b + 1;
            c.put(a[b], b);
            d.put(b, a[b]);
        }

        int i = 0;
        while (i<K) {
            int indxA1 = A1 - 1;
            int indxA2 = A2 - 1;
            while (indxA1 <= indxA2) {
                int a1 = d.get(indxA1);
                int a2 = d.get(indxA2);
                c.put(a1, indxA2);
                c.put(a2, indxA1);
                d.put(indxA1, a2);
                d.put(indxA2, a1);
                indxA1++;
                indxA2--;
            }

            int indxB1 = B1 - 1;
            int indxB2 = B2 - 1;
            while (indxB1 <= indxB2) {
                int b1 = d.get(indxB1);
                int b2 = d.get(indxB2);
                c.put(b1, indxB2);
                c.put(b2, indxB1);
                d.put(indxB1, b2);
                d.put(indxB2, b1);
                indxB1++;
                indxB2--;
            }

            boolean done = true;
            for (int j=0; j<N; j++) {
                if (d.get(j) != j+1) {
                    done = false;
                    break;
                }
            }

            if (done && i!=K-1) {
                K = K % (i+1);
                i = 0;
            } else {
                i++;
            }
        }

        for (int y : c.keySet()) {
            a[c.get(y)] = y;
        }

        for (int z = 0; z < N; z++) {
            System.out.println(a[z]);
        }

        System.out.close();
    }
}
