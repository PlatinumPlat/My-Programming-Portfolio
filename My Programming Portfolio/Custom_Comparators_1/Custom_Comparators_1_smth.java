package Custom_Comparators_1;

import java.util.*;

public class Custom_Comparators_1_smth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        LinkedList<Long> l = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            char instru = in.next().charAt(0);
            long x = in.nextInt();

            if (instru == 'F') {
                l.add(0, x);
            } else if (instru == 'E') {
                l.add(x);
            } else {
                l.remove(x);
            }
        }

        for (long z : l) {
            System.out.println(z);
        }
    }
}
