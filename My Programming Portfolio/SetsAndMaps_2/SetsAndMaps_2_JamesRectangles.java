import java.io.*;
import java.util.*;
import java.lang.Math;

public class SetsAndMaps_2_JamesRectangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] Xs = new int[N];
        int[] Ys = new int[N];

        for (int a = 0; a < N; a++) {
            Xs[a] = in.nextInt();
            Ys[a] = in.nextInt();
        }

        Map<ArrayList<Double>, Integer> map = new HashMap<>();

        for (int b = 0; b < N; b++) {
            for (int c = b + 1; c < N; c++) {
                if (b != c) {
                    int x1 = Xs[b];
                    int y1 = Ys[b];

                    int x2 = Xs[c];
                    int y2 = Ys[c];

                    double length = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

                    double midpointX = (double) (x1 + x2) / 2;
                    double midpointY = (double) (y1 + y2) / 2;

                    ArrayList<Double> tr = new ArrayList<>();

                    tr.add(length);
                    tr.add(midpointX);
                    tr.add(midpointY);

                    if (map.get(tr) != null) {
                        map.put(tr, map.get(tr) + 1);
                    } else {
                        map.put(tr, 1);
                    }
                }
            }
        }

        int total = 0;

        for (Integer val : map.values()) {
            if (val >= 2) {
                total += val * (val - 1) / 2;
            }
        }

        System.out.println(total);

    }
}
