package Custom_Comparators_2;
import java.util.*;
public class Custom_Comparators_2_Count_The_Triplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        Map<Integer, Integer> c = new HashMap<>();

        for (int a=0; a<N; a++) {
            int b = in.nextInt();
            c.put(b, c.getOrDefault(b, 0)+1);
        }
        int Dcount = 0;
        int Icount = 0;
        for (int b : c.keySet()) {
            for (int d : c.keySet()) {
                if (b!=d) {
                    if (c.containsKey(b+d)) {
                        Dcount++;
                    }
                } else {
                    if (c.get(b)>1) {
                        if (c.containsKey(b*2)) {
                            Icount++;
                        }
                    }
                }
            }
        }
        if (Dcount + Icount == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(Dcount/2 + Icount);
    }
}
