import java.util.*;

public class J_3_String_Crossing_Maximization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long A = in.nextInt();
        long B = in.nextInt();

        String S = in.next();
        String T = in.next();
        List<Triplet> letters = new ArrayList<>();
        Set<Character> chars = new HashSet<>();
        char smallest = 0;
        long min = A;
        char largest = 0;
        long max = 0L;
        Map<Character, Long> m = new HashMap();
        for (int a=0; a<A; a++) {
            char c = S.charAt(a);
            m.put(c, m.getOrDefault(c, 0L)+1);
        }

        Map<Character, Long> n = new HashMap();
        for (int a = 0; a < B; a++) {
            char c = T.charAt(a);
            n.put(c, n.getOrDefault(c, 0L) + 1);
        }


        for (Character c : m.keySet()) {
            Triplet t = new Triplet(c, m.get(c), 0L);
            if (!n.containsKey(c)) {
                letters.add(t);
                if (t.s > max && c != smallest) {
                    max = t.s;
                    largest = c;
                } else if (t.s < min && c != largest) {
                    min = t.s;
                    smallest = c;
                }
            }
            chars.add(c);
        }

        for (Character c : n.keySet()) {
            if (!chars.contains(c)) {
                Triplet t = new Triplet(c, 0L, n.get(c));
                letters.add(t);
                if (t.s > max && c != smallest) {
                    max = t.s;
                    largest = c;
                } else if (t.s < min && c != largest) {
                    min = t.s;
                    smallest = c;
                }
            } else {
                Triplet t = new Triplet(c, m.get(c), n.get(c));
                letters.add(t);

                if (t.s > max && c != smallest) {
                    max = t.s;
                    largest = c;
                } else if (t.s < min && c != largest) {
                    min = t.s;
                    smallest = c;
                }
            }
        }
        
        long count = 0;
        Collections.sort(letters);
        for (Triplet t : letters) {
            if (t.s > 0 && t.t > 0) {
                count += t.s * t.t;
            }
        }
        if (smallest==0 || largest == 0 || (B==1 && n.containsKey(largest) && n.get(largest)==1)) {
            System.out.println(count);
            return;
        }

        if (n.containsKey(smallest) && m.containsKey(smallest)) {
            count -= min;
        }
        count +=max;

        System.out.println(count);
    }

    static class Triplet implements Comparable<Triplet> {
        char c;
        long s;
        long t;

        Triplet(char character, long sCount, long tCount) {
            c = character;
            s = sCount;
            t = tCount;
        }

        public int compareTo(Triplet b) {
            if (this.s == b.s) {
                if (this.t>b.t) {
                    return 1;
                } else if (this.t<b.t) {
                    return -1;
                } else {
                    return 0;
                }
            } else {
                if (this.s > b.s) {
                    return 1;
                } else if (this.s < b.s) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}