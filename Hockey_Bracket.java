import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Hockey_Bracket {

    public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
        
        StringTokenizer at = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(at.nextToken());

        int S = Integer.parseInt(at.nextToken());

        List<List<Integer>> groupings = new ArrayList<>();
        Map<Integer, Integer> scores = new HashMap<>();
        for (int i=0; i< n/S; i++) {
            List<Integer> groupn = new ArrayList<>();
            StringTokenizer bt = new StringTokenizer(in.readLine());
            for (int a=0; a<S; a++) {
                int num = Integer.parseInt(bt.nextToken());
                groupn.add(num);
                scores.put(num, 0);

            }
            groupings.add(groupn);
        }

        for (int a=0; a< (S-1)*n/2; a++) {
            StringTokenizer ct = new StringTokenizer(in.readLine());
            int aP = Integer.parseInt(ct.nextToken());
            int bP = Integer.parseInt(ct.nextToken());
            char result = ct.nextToken().charAt(0);
            if (result=='W') {
                scores.put(aP, scores.getOrDefault(aP, 0)+3);
            } else if (result=='L') {
                scores.put(bP, scores.getOrDefault(bP, 0) + 3);
            } else {
                scores.put(aP, scores.getOrDefault(aP, 0) + 1);
                scores.put(bP, scores.getOrDefault(bP, 0) + 1);
            }
        }
        StringTokenizer dt = new StringTokenizer(in.readLine());
        int K = Integer.parseInt(dt.nextToken());

        List<Pair> curr0 = new ArrayList<>();
        for (int d0 = 0; d0 < S; d0++) {
            Pair p0 = new Pair(groupings.get(0).get(d0), scores.get(groupings.get(0).get(d0)));
            curr0.add(p0);
        }

        Collections.sort(curr0);
        System.out.print(curr0.get(K-1).name);
        for (int c=1; c< n/S; c++) {
            List<Pair> curr = new ArrayList<>();
            for (int d=0; d<S; d++) {
                Pair p = new Pair(groupings.get(c).get(d), scores.get(groupings.get(c).get(d)));
                curr.add(p);
            }
            Collections.sort(curr);
            System.out.print(" " + curr.get(K - 1).name);
        }
        System.out.println();
    }

    public static class Pair implements Comparable<Pair> {
        int name;
        int score;

        Pair (int n, int s) {
            name = n;
            score = s;
        }

        public int compareTo(Pair b) {
            if (this.score==b.score) {
                return this.name - b.name;
            } else {
                return b.score-this.score;
            }
        }
    }
}
