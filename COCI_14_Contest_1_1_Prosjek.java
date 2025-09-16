import java.util.*;

public class COCI_14_Contest_1_1_Prosjek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        long total = in.nextLong();
        System.out.print(total);
        for (int i=1; i<N; i++) {
            long b = in.nextLong();
            System.out.print(" " + (b*(i+1)-total));
            total = b*(i+1);
        }

        System.out.println();
    }
}