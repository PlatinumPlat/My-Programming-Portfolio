import java.util.*;

public class Back_To_School_17_Avalon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int G = in.nextInt();

        double out = 1.0;

        for (int i = 0; i < G; i++) {
            double e = in.nextLong();
            double p = in.nextLong();

            if (p != 0) {
                out *= (double) (p - e) / (double) p;
            }
        }

        System.out.println(out);
    }
}
