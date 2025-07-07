package SetsAndMaps_3;

import java.util.*;

public class SetsAndMaps_3_Common_Words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            int t = in.nextInt();
            int v = in.nextInt();

            Map<String, Integer> n = new HashMap<>();

            for (int a = 0; a < t; a++) {
                String let = in.next();
                n.put(let, n.getOrDefault(let, 0)+1);
            }

            List<Pair> l = new ArrayList<>();

            for (String b : n.keySet()) {
                Pair newPair = new Pair(b, n.get(b));
                l.add(newPair);
            }

            Collections.sort(l);

            System.out.print(v);
            if (v % 10 == 1) {
                if (v % 100 == 11) {
                    System.out.print("th");
                } else {
                    System.out.print("st");
                }
            } else if (v % 10 == 2) {
                if (v % 100 == 12) {
                    System.out.print("th");
                } else {
                    System.out.print("nd");
                }
            } else if (v % 10 == 3) {
                if (v % 100 == 13) {
                    System.out.print("th");
                } else {
                    System.out.print("rd");
                }
            } else {
                System.out.print("th");
            }
            
            System.out.print(" most common word(s):");
            System.out.println();
            if (v <= l.size()) {
                if (v == 1 || l.get(v-1).occur < l.get(v-2).occur) {
                    for (int k = v-1; k<l.size() && l.get(k).occur == l.get(v-1).occur; k++) {
                        System.out.println(l.get(k).word);
                    }
                }
            }
            System.out.println("\n");
        }
    }

    static class Pair implements Comparable<Pair> {
        int occur;
        String word;

        Pair(String w, int o) {
            word = w;
            occur = o;
        }

        public int compareTo(Pair o) {
            return o.occur-this.occur;
        }
    }
}
