package Custom_Comparators_1;

import java.io.*;
import java.util.*;

public class Custom_Comparators_1_MrNsPresents {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        LinkedList<Pair> l = new LinkedList<>();
        Map<Integer, Integer> removes = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer nt = new StringTokenizer(r.readLine());
            char instru = nt.nextToken().charAt(0);
            int x = Integer.parseInt(nt.nextToken());

            if (instru == 'F') {
                l.add(0, new Pair(x, i));
            } else if (instru == 'E') {
                l.add(l.size(), new Pair(x, i));
            } else {
                removes.put(x, i);
            }
        }
        for (Pair z : l) {
            if (!removes.containsKey(z.val) || removes.get(z.val)<z.line) {
                System.out.println(z.val);
            }
        }
    }

    static class Pair implements Comparable<Pair> {
        int val;
        int line;

        Pair(int v, int l) {
            val = v;
            line = l;
        }

        public int compareTo(Pair o) {
            return o.line - this.line;
        }
    }
}
