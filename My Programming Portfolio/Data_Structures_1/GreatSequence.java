package Data_Structures_1;

import java.util.*;

public class GreatSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        long K = in.nextLong();
        int Q = in.nextInt();
        long[] PSAall = new long[N];
        Map<Integer, ArrayList<Integer>> c = new HashMap<>();
        for (int a = 0; a < N; a++) {
            int i = in.nextInt();
            if (a > 0) {
                PSAall[a] = PSAall[a - 1] + i;
            } else {
                PSAall[a] = i;
            }
            if (i >= -1000 && i <= 1000) {
                if (!c.containsKey(i)) {
                    c.put(i, new ArrayList<>());
                }

                c.get(i).add(a);
            }
        }

        for (int i : c.keySet()) {
            ArrayList<Integer> Curr = c.get(i);
            Collections.sort(Curr);
            c.put(i, Curr);
        }

        for (int b = 0; b < Q; b++) {
            int ai = in.nextInt();
            int bi = in.nextInt();
            int xi = in.nextInt() -1;
            int yi = in.nextInt() -1;

            if (xi == 0) {
                if (PSAall[yi] <= K) {
                    System.out.println("No");
                    continue;
                }
            } else {
                if (PSAall[yi] - PSAall[xi - 1] <= K) {
                    System.out.println("No");
                    continue;
                }
            }
            
            if (!c.containsKey(ai) || !c.containsKey(bi)) {
                System.out.println("No");
                continue;
            }


            ArrayList<Integer> ar = c.get(ai);
            int xg = Collections.binarySearch(ar, xi);
            int yg = Collections.binarySearch(ar, yi);

            if (xg < 0) {
                xg = xg * -1 - 1;
            }
            if (yg < 0) {
                yg = yg * -1 - 2;
            }

            if (yg - xg + 1 == 0) {
                System.out.println("No");
                continue;
            }

            ArrayList<Integer> br = c.get(bi);
            int xg2 = Collections.binarySearch(br, xi);
            int yg2 = Collections.binarySearch(br, yi);

            if (xg2 < 0) {
                xg2 = xg2 * -1 - 1;
            }
            if (yg2 < 0) {
                yg2 = yg2 * -1 - 2;
            }

            if (yg2 - xg2 + 1 == 0) {
                System.out.println("No");
                continue;
            }

            System.out.println("Yes");
        }
    }
}
