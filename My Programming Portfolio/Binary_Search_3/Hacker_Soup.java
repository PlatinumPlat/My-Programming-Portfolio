package Binary_Search_3;

import java.util.*;

public class Hacker_Soup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long N = in.nextLong();
        int K = in.nextInt();
        int Q = in.nextInt();

        long[] ls = new long[K];
        long[] ts = new long[K];
        long[] rs = new long[K];
        long[] bs = new long[K];
        for (int a=0; a<K; a++) {
            ls[a] = in.nextLong();
            ts[a] = in.nextLong();
            rs[a] = in.nextLong();
            bs[a] = in.nextLong();
        }

        for (int i=0; i<Q; i++) {
            long y = in.nextLong();
            long x = in.nextLong();

            for (int d=K-1; d>=0; d--) {
                if ((x>=ts[d] && x<=bs[d]) && (y>=ls[d] && y<= rs[d])) {
                    if (ts[d] - bs[d] %2 == 0) {
                        long length = (bs[d]-ts[d]);
                        long Xref = ts[d] + length/2;
                        long Yref = ls[d] + length/2;
                        if (x <= Xref && y <= Yref) {
                            long xdiff = Xref - x;
                            long ydiff = Yref - y;
                            x = Xref - ydiff;
                            y = Yref + xdiff;
                        } else if (x > Xref && y < Yref) {
                            long xdiff = x - Xref;
                            long ydiff = Yref - y;
                            x = Xref - ydiff;
                            y = Yref - xdiff;
                        } else if (x < Xref && y > Yref) {
                            long xdiff = Xref - x;
                            long ydiff = y - Yref;
                            x = Xref + ydiff;
                            y = Yref + xdiff;
                        } else if (x >= Xref && y >= Yref) {
                            long xdiff = x - Xref;
                            long ydiff = y - Yref;
                            x = Xref + ydiff;
                            y = Yref - xdiff;
                        }
                    } else {
                        long length = (bs[d] - ts[d]);
                        double Xref = (double) length / 2 + ts[d];
                        double Yref = (double) length / 2 + ls[d];
                        if (x <= Xref && y <= Yref) {
                            double xdiff = Xref - x;
                            double ydiff = Yref - y;
                            x = (long) (Xref - ydiff);
                            y = (long) (Yref + xdiff);
                        } else if (x > Xref && y < Yref) {
                            double xdiff = x - Xref;
                            double ydiff = Yref - y;
                            x = (long) (Xref - ydiff);
                            y = (long) (Yref - xdiff);
                        } else if (x < Xref && y > Yref) {
                            double xdiff = Xref - x;
                            double ydiff = y - Yref;
                            x = (long) (Xref + ydiff);
                            y = (long) (Yref + xdiff);
                        } else if (x >= Xref && y >= Yref) {
                            double xdiff = x - Xref;
                            double ydiff = y - Yref;
                            x = (long) (Xref + ydiff);
                            y = (long) (Yref - xdiff);
                        }
                    }

                }
            }
            System.out.println((y-1)*N + x);
        }
    }
}