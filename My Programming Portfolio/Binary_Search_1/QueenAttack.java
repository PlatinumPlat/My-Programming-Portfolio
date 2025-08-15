package Binary_Search_1;

import java.util.*;

public class QueenAttack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        Set<Pair> attacked = new HashSet<>();
        for (int i = 0; i < M; i++) {
            int x = in.nextInt()-1;
            int y = in.nextInt()-1;
            for (int a = 0; a < N; a++) {
                Pair h = new Pair(a, y);
                attacked.add(h);
            }
            for (int b = 0; b < N; b++) {
                Pair h = new Pair(x, b);
                attacked.add(h);
            }
            int x1 = x + 1;
            int y1 = y + 1;
            while (true) {
                if (x1 >= 0 && x1 < N && y1 >= 0 && y1 < N) {
                    Pair h = new Pair(x1, y1);
                    attacked.add(h);
                    x1++;
                    y1++;
                } else {
                    break;
                }
            }
            int x2 = x - 1;
            int y2 = y - 1;
            while (true) {
                if (x2 >= 0 && x2 < N && y2 >= 0 && y2 < N) {
                    Pair h = new Pair(x2, y2);
                    attacked.add(h);
                    x2--;
                    y2--;
                } else {
                    break;
                }
            }
            int x3 = x + 1;
            int y3 = y - 1;
            while (true) {
                if (x3 >= 0 && x3 < N && y3 >= 0 && y3 < N) {
                    Pair h = new Pair(x3, y3);
                    attacked.add(h);
                    x3++;
                    y3--;
                } else {
                    break;
                }
            }
            int x4 = x - 1;
            int y4 = y + 1;
            while (true) {
                if (x4 >= 0 && x4 < N && y4 >= 0 && y4 < N) {
                    Pair h = new Pair(x4, y4);
                    attacked.add(h);
                    x4--;
                    y4++;
                } else {
                    break;
                }
            }
        }
        System.out.println(N * N - attacked.size());
    }

    public static class Pair {
        int first;
        int second;

        Pair(int a, int b) {
            first = a;
            second = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair p = (Pair) o;
            return first == p.first && second == p.second;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }
}
