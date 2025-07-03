package Lists_2;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;

public class Lists_2_Cops_And_Robbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] banks = new int[N];
        ArrayList<Integer> b = new ArrayList<>();
        Set<Integer> track = new HashSet<>();
        ArrayList<Integer> other = new ArrayList<>();
        int[] order = new int[N];
        ArrayList<Integer> done = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int n = in.nextInt();
            banks[i] = n;
            if (!b.contains(n)) {
                b.add(n);
            }
        }

        for (int z = 1; z <= N; z++) {
            if (!b.contains(z)) {
                other.add(z);
            }
        }

        if (b.size() == 1) {
            System.out.println(-1);
            return;
        }

        for (int a = 0; a < N; a++) {
            int x = banks[a];

            if (b.contains(x) && !done.contains(x)) {
                if (b.indexOf(x) == 0) {
                    order[a] = b.get(b.size() - 1);
                    done.add(x);
                } else {
                    order[a] = b.get(b.indexOf(x) - 1);
                    done.add(x);
                }
            } else if (b.size() == 1 && !done.contains(x)) {
                order[a] = b.get(0);
                done.add(x);
            } else {
                if (other.size() > 0) {
                    order[a] = other.get(0);
                    other.remove(0);
                } else {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.print(order[0]);
        for (int c = 1; c < N; c++) {
            System.out.print(" ");
            System.out.print(order[c]);
        }
    }
}