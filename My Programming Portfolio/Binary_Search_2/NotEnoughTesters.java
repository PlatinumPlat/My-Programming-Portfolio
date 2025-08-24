package Binary_Search_2;
import java.util.*;
import java.lang.*;
import java.io.*;

public class NotEnoughTesters {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer ast = new StringTokenizer(r.readLine());
        int T = Integer.parseInt(ast.nextToken());

        int[] Ks = new int[T];
        int[] As = new int[T];
        int[] Bs = new int[T];
        for (int e = 0; e < T; e++) {
            StringTokenizer bst = new StringTokenizer(r.readLine());
            Ks[e] = Integer.parseInt(bst.nextToken());
            As[e] = Integer.parseInt(bst.nextToken());
            Bs[e] = Integer.parseInt(bst.nextToken());
        }
        int max = 0;

        for (int a = 0; a < T; a++) {
            max = Math.max(max, Bs[a]);
        }

        Map<Integer, ArrayList<Integer>> Kcorresp = new HashMap<>();
        int[] factors = new int[max];
        ArrayList<Integer> Kcurr1 = new ArrayList<>();
        for (int c = 0; c < max; c++) {
            factors[c]++;
            Kcurr1.add(c + 1);
        }
        Kcorresp.put(1, Kcurr1);

        for (int b = 2; b < max + 1; b++) {
            int multiplier = max / b;
            for (int c = 1; c < multiplier + 1; c++) {
                factors[c * b - 1]++;
            }
        }

        for (int f = 1; f < max + 1; f++) {
            int num = factors[f - 1];

            if (!Kcorresp.containsKey(num)) {
                Kcorresp.put(num, new ArrayList<>());
            }

            Kcorresp.get(num).add(f);
        }

        for (int i = 0; i < T; i++) {
            int K = Ks[i];
            int A = As[i];
            int B = Bs[i];

            if (K == 1) {
                if (A == 1) {
                    out.println(1);
                } else {
                    out.println(0);
                }
            } else {
                ArrayList<Integer> factorsList = Kcorresp.get(K);
                if (factorsList == null) {
                    out.println(0);
                    continue;
                }
                int startIndx = 0;
                // if (factorsList.get(0) >= A && factorsList.get(factorsList.size() - 1) <= B)
                // {
                // startIndx = 0;
                // } else if (factorsList.get(factorsList.size() - 1) < A) {
                // out.println(0);
                // continue;
                // } else {
                startIndx = Collections.binarySearch(factorsList, A);
                if (startIndx < 0) {
                    startIndx = -1 * (startIndx + 2) + 1;
                }
                // }
                int endIndx = 0;
                // if (factorsList.get(factorsList.size() - 1) <= B) {
                // endIndx = factorsList.size() - 1;
                // } else {
                endIndx = Collections.binarySearch(factorsList, B);
                if (endIndx < 0)
                    endIndx = -1 * (endIndx + 2);
                // }
                out.println(endIndx - startIndx + 1);
            }
        }

        out.close();
    }
}
