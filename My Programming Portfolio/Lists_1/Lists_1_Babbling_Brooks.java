package Lists_1;
import java.util.Scanner;
import java.util.LinkedList;
import java.lang.Math;


public class Lists_1_Babbling_Brooks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        LinkedList<Double> rivers = new LinkedList<>();
        for (int i=0; i<N; i++) {
            double d = in.nextInt();
            rivers.add(d);
        }

        while (true) {
            int instru = in.nextInt();

            if (instru == 99) {
                int r = in.nextInt();
                int p = in.nextInt();
                double val = rivers.get(r-1);
                double v1 = val * p/100;
                double v2 = val-v1;
                rivers.remove(r-1);
                rivers.add(r-1, v1);
                rivers.add(r, v2);
            } else if (instru == 88) {
                int r = in.nextInt();
                double v1 = rivers.get(r-1);
                double v2 = rivers.get(r);
                rivers.remove(r-1);
                rivers.remove(r-1);
                rivers.add(r-1, v1+v2);
            } else {
                break;
            }
        }

        long rounded = Math.round(rivers.getFirst());
        System.out.print(rounded);
        for (int a=1; a<rivers.size(); a++) {
            System.out.print(" ");
            long ro = Math.round(rivers.get(a));
            System.out.print(ro);
        }
        System.out.println();
    }
}
